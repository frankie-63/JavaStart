import java.util.Scanner;

public class CS_ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a character: ");
        String letterS = sc.nextLine().toUpperCase();
        if (letterS.length() > 1) {
            System.out.println("This is not a single character");
            System.exit(0);
        }
        if (letterS.isBlank()) {
            System.out.println("You haven't input a character");
            System.exit(0);
        }
        char letter = letterS.charAt(0);
        char[] vowels = new char[10];
        char[] consonants = new char[42];
        int n1 = 0;
        int n2 = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
                vowels[n1] = i;
                ++n1;
            } else {
                consonants[n2] = i;
                ++n2;
            }
        }
        int y = 0;
        for (char consonant : consonants) {
            if (consonant == letter) {
                System.out.println("Input letter is consonant");
                ++y;
                break;
            }
        }
        for (char vowel : vowels) {
            if (vowel == letter) {
                System.out.println("Input letter is vowel");
                ++y;
                break;
            }
        }
        if (y == 0){
            System.out.println("Input is not letter");
        }
        sc.close();
    }
}
