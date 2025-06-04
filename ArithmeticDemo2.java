import java.util.Scanner;

public class ArithmeticDemo2 {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter first double >> ");
            firstNumber = input.nextDouble();
            System.out.print("Please enter second double >> ");
            secondNumber = input.nextDouble();

            sum = firstNumber + secondNumber;
            difference = firstNumber - secondNumber;
            average = (double) sum / 2;

            System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
            System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
            System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
        }

    }
}