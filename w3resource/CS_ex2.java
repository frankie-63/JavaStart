import java.util.Scanner;

public class CS_ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input coefficient a: ");
        double a = in.nextDouble();
        System.out.print("Input coefficient b: ");
        double b = in.nextDouble();
        System.out.print("Input coefficient c: ");
        double c = in.nextDouble();
        double D = b * b - 4 * a * c;
        if (D > 0.0) {
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("The roots are: " + x1 + " and " + x2);
        }
        else if (D == 0.0) {
            double x = -b / 2 * a;
            System.out.println("The root is: " + x);
        }
        else {
            System.out.println("There are no real roots");
        }
        in.close();
    }
}
