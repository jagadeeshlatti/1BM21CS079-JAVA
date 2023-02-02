import java.util.Scanner;

abstract class shape {
    double a, b;
    abstract void printArea();
}

class rectangle extends shape {
    void getdata(double x, double y) {
        a = x;
        b = y;
    }

    void printArea() {
        double x = a * b;
        System.out.println("The area of the rectangle is : " + x);
    }
}

class triangle extends shape {
    void getdata(double x, double y) {
        a = x;
        b = y;
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("The area of the triangle is : " + area);
    }
}

class circle extends shape {
    void getdata(double x) {
        a = x;
    }

    void printArea() {
        double area = 3.14 * a * a;
        System.out.println("The area of the circle is : " + area);
    }
}

class hi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice;
            rectangle r = new rectangle();
            triangle t = new triangle();
            circle c = new circle();
            System.out.print(
                    "\n\nSelect the shape :-\n------------------------------------------\n1) Rectangle\n2) Triangle\n3) Circle\n------------------------------------------\nEnter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the length and breadth : ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    r.getdata(l, b);
                    r.printArea();
                    break;
                case 2:
                    System.out.print("Enter the base and height : ");
                    double ba = sc.nextDouble();
                    double h = sc.nextDouble();
                    t.getdata(ba, h);
                    t.printArea();
                    break;
                case 3:
                    System.out.print("Enter the radius : ");
                    double r1 = sc.nextDouble();
                    c.getdata(r1);
                    c.printArea();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}