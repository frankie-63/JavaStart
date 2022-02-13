import java.text.DecimalFormat;
import java.util.Scanner;
public class CS_ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print("Enter the first floating-point number: ");
        double firstDouble = scanner.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double secondDouble = scanner.nextDouble();
        String firstStr = df.format(firstDouble).replace(',', '.');
        String secondStr = df.format(secondDouble).replace(',', '.');
        double fD = Double.parseDouble(firstStr);
        double sD = Double.parseDouble(secondStr);
        if (fD != sD) {
            System.out.println(fD + " and " + sD + " are different");
        } else {
            System.out.println(fD + " and " + sD + " are equal");
        }
        scanner.close();
    }
}
