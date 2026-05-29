class TwoD {
    int x, y;
    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD {
    int z;
    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD {
    int t;
    FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}
class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] coords) {
        this.coords = coords;
    }

    static void showXY(Coords<? extends TwoD> c) {
        for (TwoD p : c.coords)
            System.out.println(p.x + " " + p.y);
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        for (ThreeD p : c.coords)
            System.out.println(p.x + " " + p.y + " " + p.z);
    }
}
public class Q9 {
    public static void main(String[] args) {
        TwoD[] a = {new TwoD(1, 2)};
        ThreeD[] b = {new ThreeD(3, 4, 5)};
        FourD[] c = {new FourD(6, 7, 8, 9)};

        Coords<TwoD> c1 = new Coords<>(a);
        Coords<ThreeD> c2 = new Coords<>(b);
        Coords<FourD> c3 = new Coords<>(c);

        Coords.showXY(c1);
        Coords.showXY(c2);
        Coords.showXYZ(c2);
        Coords.showXYZ(c3);
    }
}