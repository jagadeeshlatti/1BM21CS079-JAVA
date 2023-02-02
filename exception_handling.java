import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("We will perform division now :");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\nEnter the Dividend : ");
            int num1 = Integer.parseInt(sc.next());
            System.out.print("Enter the Divisor : ");
            int num2 = Integer.parseInt(sc.next());
            double result = (double) num1 / num2;
            System.out.println("The quotient is : " + result);
        } catch (NumberFormatException e) {
            System.out.print("Enter a valid integer value!\n" + e + "\n");
        } catch (ArithmeticException e) {
            System.out.print("Cannot perform the division operation!\n" + e + "\n");
        }
        sc.close();
    }
}