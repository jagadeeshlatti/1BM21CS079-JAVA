import java.util.Scanner;

class Father extends Exception {
    int fage;

    Father(int x) {
        fage = x;
    }

    public String toString() {
        return "Father's age cannot be negative!";
    }
}

class Son extends Father {
    int sage;

    Son(int x, int y) {
        super(x);
        sage = y;
    }

    public String toString() {
        return "Son's age cannot be greater than or equal to father!";
    }
}

class Wrongage {
    static int x, y;

    static void Fatherage(int x) throws Father {
        System.out.println("Called Fatherage(" + x + ")");
        if (x < 0) {
            throw new Father(x);
        }
        System.out.println("Normal exit father's age is - " + x);
    }

    static void Sonage(int x, int y) throws Son {
        System.out.println("Called Sonage(" + y + ")");
        if (y >= x) {
            throw new Son(x, y);
        }
        System.out.println("Normal exit son's age is - " + y);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter father's age : ");
        x = sc.nextInt();
        System.out.print("Enter Son age : ");
        y = sc.nextInt();
        sc.close();
        try {
            Fatherage(x);
        } catch (Father e) {
            System.out.println(e);
        }
        try {
            Sonage(x, y);
        } catch (Son e) {
            System.out.println(e);
        }
    }
}