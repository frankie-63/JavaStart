import java.util.Scanner;

public class CS_ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of day of the week: ");
        int numberOfDay = in.nextInt();
        String day;
        switch (numberOfDay){
            case 1: day = "Sunday";break;
            case 2: day = "Monday";break;
            case 3: day = "Tuesday";break;
            case 4: day = "Wednesday";break;
            case 5: day = "Thursday";break;
            case 6: day = "Friday";break;
            case 7: day = "Saturday";break;
            default: day = "";
                System.out.println("The input is not integer 1 - 7");
        }
        System.out.println(day);
        in.close();
    }
}
