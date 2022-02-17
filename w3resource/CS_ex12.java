import java.util.Scanner;
public class CS_ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the 5 numbers : ");
        int count = sc.nextInt();
        int i = 0;
        while (i < 4) {
            count += sc.nextInt();
            i++;
        }
        System.out.println("The sum of 5 no is : " + count);
        System.out.println("The Average is : " + (double) count / 5);
        sc.close();
    }
}