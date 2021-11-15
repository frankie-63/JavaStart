import java.util.Scanner;

public class maxMod5 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Input the first number");
    int x = in.nextInt();
    System.out.println("Input the second number");
    int y = in.nextInt();

    if (x == y) System.out.println(0);
    else if ((x % 5) == (y % 5)) System.out.println(Math.min(x, y));
    else  System.out.println(Math.max(x, y));

    in.close();

  }
}
