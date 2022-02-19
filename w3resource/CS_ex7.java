import java.util.Scanner;

public class CS_ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int m = sc.nextInt();
        System.out.print("Input a year: ");
        int year = sc.nextInt();
        if (year < 1582 || year > 3000) {
            System.out.print("Input a year between 1582 and 3000: ");
            year = sc.nextInt();
        }
        boolean isBisSextus = (year % 4 == 0 && year % 100 != 0 ^ year % 400 == 0);
        String month = "";
        switch (m) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.print("Input a month number between 1 and 12: ");
                m = sc.nextInt();
        }
        int days = 31;
        if (m == 2 && isBisSextus) {
            days = 29;
        } else if (m == 2) {
            days = 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            days = 30;
        }
        System.out.println(month + " " + year + " has " + days + " days.");
        sc.close();

    }

}

