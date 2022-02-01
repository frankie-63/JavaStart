import java.util.Arrays;
import java.util.Scanner;

// http://javazadachi.blogspot.com/p/java_2378.html

    public class JavaZadachi9 {
        public static void main(String[] args) {
            // 9.
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            for (int i = 2; i < (Math.sqrt(n) + 1); i++) {
                if (n % i == 0) {
                    System.out.println("This is not a prime number"); count = 0; break;
                }
                else count++;
            }
            if (count != 0) {System.out.println("This is a prime number");}
        }
}

