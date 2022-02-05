import java.util.Arrays;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        // Создать программу, которая будет проверять, является ли слово из пяти букв,
        // введённое пользователем, палиндромом (примеры: «комок», «ротор»).
        System.out.println("Enter a text: ");
        Scanner sc = new Scanner(System.in);
        String word_input = sc.nextLine();
        String word1 = word_input.toLowerCase();
        String word2 = word1.replaceAll(" ", "");
        String word = word2.replaceAll(",", "");
        int y = word.length();
        char[] word_array;
        word_array = word.toCharArray();
        char[] reverse_array = new char[y];
        for(int i = y - 1, k = 0; i >= 0; i--, k++) {
            reverse_array[k] = word_array[i];
        }
        if(Arrays.equals(reverse_array, word_array)) {
            System.out.println("WOW!!! It's a palindrome!");
        } else System.out.println("Sorry, this text isn\'t a palindrome");
    }
}
