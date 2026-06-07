// Q2.java
// Complete only the TODO parts.
// Topic: unbound instance method reference: ClassName::instanceMethodName.

import java.util.*;

// TODO-1: Write a generic functional interface named Ranker<T>.
// It must compare two objects of type T and return int.
interface Ranker<T>{
    int compare(T a,T b);
}
class Book {
    // TODO-2: Add private fields: title, pages, rating.
    private String title; 
    private int pages; 
    private int rating;
    // TODO-3: Write a constructor Book(String title, int pages, int rating).
      Book(String title, int pages, int rating){
        this.title=title;
        this.pages=pages;
        this.rating=rating;
      }
    // TODO-4: Write method score().
    // Formula: rating * 1000 - pages
       int score(){
        return rating*1000-pages;
       }
    // TODO-5: Write method compareScore(Book other).
    // It must compare this book's score with other book's score.
    // This method must be compatible with: Ranker<Book> byScore = Book::compareScore;
        int compareScore(Book b){
            return this.score()-b.score();
        }
    // TODO-6: Override toString().
    // Format: title + "(" + score() + ")"
    public String toString(){
        return title + "(" + score() + ")";
    } 
}

public class Q2 {
    static <T> T best(List<T> list, Ranker<T> ranker) {
        T ans = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (ranker.compare(list.get(i), ans) > 0) {
                ans = list.get(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("A", 300, 4));
        books.add(new Book("B", 250, 5));
        books.add(new Book("C", 420, 5));

        Ranker<Book> byScore = Book::compareScore;

        System.out.println("Best: " + best(books, byScore));
        books.sort(Book::compareScore);

        for (Book b : books) {
            System.out.println(b);
        }
    }
}
