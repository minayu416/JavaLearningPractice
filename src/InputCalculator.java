import java.util.Scanner;

public class InputCalculator {

    // public static void inputThenPrintSumAndAverage() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int cnt = 0;

        while (true){
            boolean hasNextINT = scanner.hasNextInt();
            if (hasNextINT){
                int inputNumber = scanner.nextInt();
                number += inputNumber;
                // System.out.println(hasNextINT);
                cnt += 1;
            }
            else {
                System.out.println("SUM = " + number + " AVG = " + (number/cnt));
                break;
            }

        }
        //System.out.println("SUM = " + number + " AVG = " + (number/cnt));
        scanner.close();
    }



}
