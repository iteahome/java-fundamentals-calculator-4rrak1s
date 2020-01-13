import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int FirstNumber, SecondNumber;

        System.out.println("Insert your first value...");
        FirstNumber = sc.nextInt();

        System.out.println("Insert your second value...");
        SecondNumber = sc.nextInt();

        System.out.println("Select the desired operation:");
        System.out.println("To add (+) your values, press 1");
        System.out.println("To subtract (-) your values, press 2");
        System.out.println("To multiply (*) your values, press 3");
        System.out.println("To divide (/) your values, press 4");
        System.out.println("To perform modulo (%), press 5.");

        int UsrIn;
        UsrIn = sc.nextInt();

        int OperationChoice = UsrIn;
        switch (OperationChoice) {
            case 1:
                System.out.println (FirstNumber + SecondNumber);
                break;
            case 2:
                System.out.println (FirstNumber - SecondNumber);
                break;
            case 3:
                System.out.println (FirstNumber * SecondNumber);
                break;
            case 4:
                System.out.println (FirstNumber / SecondNumber);
                break;
            case 5:
                System.out.println (FirstNumber % SecondNumber);
                break;
            default:
                System.out.println ("Please Enter a Valid Option");

        }

    }
}