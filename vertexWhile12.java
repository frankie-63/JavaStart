import java.util.Arrays;
import java.util.Scanner;
// https://vertex-academy.com/tutorials/ru/zadachi-na-cikl-2/
public class vertexWhile12 {
    public static void main(String[] args) {
        // 1. Необходимо, чтоб программа выводила на экран вот такую последовательность:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        int count = 0;
        int i = 1;
        while (count < (100 - 7)) {
            count = i * 7;
            i++;
            System.out.print(count + " ");
        }

        // 2. Необходимо вывести на консоль такую последовательность чисел:
        // 1 2 4 8 16 32 64 128 256 512
        System.out.println();
        int count2 = 1;
        while (count2 < 1000) {
            System.out.print(count2 + " ");
            count2 *= 2;

        }

    }
}
