import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        double height, bmi;
        int weight;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height (m): ");
        height = input.nextDouble();
        System.out.print("Please enter your weight: ");
        weight = input.nextInt();

        bmi = weight / (height* height);

        System.out.println("Your Body Mass Index is " + bmi);

        input.close();
    }
}
