import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your weight in pounds? Input weight in pounds: ");
        double weight = keyboard.nextDouble();

        System.out.println("\nWhat is your height in inches? Input height in inches: ");
        double height = keyboard.nextDouble();

        double BMI = weight / (height * height) * 703;

        System.out.println("\nYou weigh " + weight + " pounds and are " + height + " inches tall.");
        System.out.println("Your Body Mass Index (BMI) is " + Math.round(BMI) + ".\n");

        keyboard.close();
    }
}
