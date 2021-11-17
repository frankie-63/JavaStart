import java.util.Scanner;
import java.util.Random;

public class redTicket {
  public static void main(String[] args) {

    Random random = new Random();
    int a = random.nextInt(2);
    int b = random.nextInt(2);
    int c = random.nextInt(2);

    System.out.println("Your ticket number is "+a+" "+b+" "+c);
    System.out.print("Your gain is ");
    if (a == 2 && b == 2 && c == 2) {System.out.println(10);}
    else if (a == b && b == c) {System.out.println(5);}
    else if (b == c && b != c) {System.out.println(1);}
    else {System.out.println(0);}
  }
}
