import java.util.Arrays;
import java.util.Scanner;

// http://javazadachi.blogspot.com/p/java_2378.html

    public class JavaZadachi78 {
        public static void main(String[] args) {
            // 7. Создайте программу, вычисляющую факториал натурального числа n,
            // которое пользователь введёт с клавиатуры.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            int factorial = 1;
            for (int i = 1; i <= n; ++i) {
                factorial *= i;
            }
            System.out.println("Factorial of the entered number is " + factorial);

            // 8. Выведите на экран все положительные делители натурального числа,
            // введённого пользователем с клавиатуры.
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            int b = 0;
            System.out.println("All integer divisors are: ");
            for (int j = 1; j < a; j++) {
                if (a % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
}

