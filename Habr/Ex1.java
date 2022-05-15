package src.Basis;

public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for(int j = 0; j < numbers.length; j++) {
            numbers[j] = (int) Math.round(Math.random() * 100);
        }
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        for(int i : numbers) {
            System.out.print(i + ", ");
            sum += i;
            if(max < i) {
                max = i;
            }
            if(min > i) {
                min = i;
            }
        }
        System.out.println();
        System.out.println("Maximal value in array is " + max);
        System.out.println("Minimal value in array is " + min);
        System.out.println("Average value of array of numbers is " + Math.round((double) sum / numbers.length));
    }
}
