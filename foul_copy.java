package AlexKorolevTutorial;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void array123(String str1) {
        System.out.print("This program writes \"true\" if an input contains \n");
        System.out.println("sequence of numbers 1, 2, 3,");
        System.out.println("otherwise the program writes \"false\"");
        char[] str1Array = str1.toCharArray();
        ArrayList<Integer> intList = new ArrayList<>();
        int exit_count = 0;
        for (int i = 0; i < str1Array.length; i++) {
            if (Character.isDigit(str1Array[i])) {
                int a = str1Array[i] - '0';
                intList.add(a);
                continue;
            } else System.out.println("Error. You've enter not only numbers");
            exit_count++;
            break;
        }
        if (exit_count != 0) {
            System.exit(0);
        }
        int[] intArray = new int[intList.size()];
        for (int j = 0; j < intArray.length; j++) {
            if (intArray[j] == 1 && intArray[j + 1] == 2 && intArray[j + 2] == 3) System.out.println(true);
            else continue;
        }
        }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a sequence of numbers. Example: 128765");
            System.out.print("Print here: ");
            String str = scanner.nextLine();
            while (str.isEmpty()) {
                System.out.println("Please enter a sequence of numbers!");
            }
            array123(str);
        }

    }


