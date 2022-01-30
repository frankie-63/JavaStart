import java.util.Scanner;
// https://vertex-academy.com/tutorials/ru/zadachi-na-cikl/
public class vertexCicles45 {
    public static void main(String[] args) {
        // 4. Необходимо вывести на экран таблицу умножения на 3
        for (int i = 0; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));
        }

        // 5. Напишите программу, где пользователь вводит любое целое положительное число.
        // А программа суммирует все числа от 1 до введенного пользователем числа.

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= x; ++i) {
            count += i;
        }
        System.out.println("Sum of all numbers from " + 1 + " to " + x + " is equal to " + count);

    }
}
