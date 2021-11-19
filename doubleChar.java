import java.util.Scanner;


public class doubleChar {
  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
    String str1 = scanner1.nextLine();
    String str2 = "";
    String xx;
    int i = 0;


    do {xx = String.valueOf(str1.charAt(i))+String.valueOf(str1.charAt(i));
      ++i;
      str2 = str2+xx;
    }  while (i < str1.length());

    System.out.println(str2);
    scanner1.close();

  }
}
