import java.util.Arrays;
import java.util.Scanner;

// http://javazadachi.blogspot.com/p/java_2378.html
    public class JavaZadachi25 {
        public static void main(String[] args) {
            // 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
            int element = 1;
            for(int i = 1; i <= 55; i++) {
                System.out.print(element + " ");
                element += 2;
            }

            // 5 Мое решение (неправильное, не понял условия)
            System.out.println();
            for (int b = 2, n = 1, x = 2 * b - 1; x < 10000; ++n) {
                System.out.println(x);
                x = 2 * (b + n) - 1;
            }

            // 5. Решение с сайта
            for(int a=2;a<10000;a=2*a-1){
                System.out.print(a+" ");
            }


        }
}

