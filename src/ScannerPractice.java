import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (!(age < 0 || age >= 100)){
            System.out.println("Your age is: " + (2020 - age));

        } else {
            System.out.println("plz input range of age 0~100");
        }
        scanner.nextLine();


        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        scanner.close();
    }



}
