import java.util.Random;

public class blueTicket {

  public static void main(String[] args) {

    Random random = new Random();
    int a = random.nextInt(10);
    int b = random.nextInt(10);
    int c = random.nextInt(10);

    System.out.println("Your ticket number is " + a + " " + b + " " + c);

    if ((a + b) == 10 * (a + c) || (a + b) == 10 * (b + c)) {
      System.out.println(5);
    }
    else if ((a + b) == 10 || (a + c) == 10 || (b + c) == 10) {
      System.out.println(10);
    }
    else System.out.println(0);

  }
}
