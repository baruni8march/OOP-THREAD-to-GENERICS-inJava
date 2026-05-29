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
    int a;

    FourD(int x, int y, int z, int a) {
        super(x, y, z);
        this.a = a;
    }
}

class Coords<T extends TwoD> {
    T[] t;

    Coords(T[] arr) {
        t = arr;
    }

    static void showXY(Coords<? extends TwoD> c) {
        for (TwoD p : c.t) {
            IO.println(p.x + " " + p.y);
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        for (ThreeD p : c.t) {
            IO.println(p.x + " " + p.y + " " + p.z);
        }
    }

    static void showAll(Coords<? extends FourD> c) {
        for (FourD p : c.t) {
            IO.println(p.x + " " + p.y + " " + p.z + " " + p.a);
        }
    }
}

public class chat4 {
    public static void main(String[] args) {
        TwoD[] td = {
            new TwoD(1, 2),
            new TwoD(3, 4)
        };

        ThreeD[] thd = {
            new ThreeD(5, 6, 7),
            new ThreeD(8, 9, 10)
        };

        FourD[] fd = {
            new FourD(1, 1, 1, 1),
            new FourD(2, 2, 2, 2)
        };

        Coords<TwoD> c1 = new Coords<TwoD>(td);
        Coords<ThreeD> c2 = new Coords<ThreeD>(thd);
        Coords<FourD> c3 = new Coords<FourD>(fd);

        Coords.showXY(c1);
        Coords.showXY(c2);
        Coords.showXY(c3);

        Coords.showXYZ(c2);
        Coords.showXYZ(c3);

        Coords.showAll(c3);
    }
}