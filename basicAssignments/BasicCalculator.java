import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args) {
        int n1, n2, chosen;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.println("Select the operator you want: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        chosen = input.nextInt();
        
        switch (chosen) {
            case 1:
                System.out.print("Answer is: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Answer is:" + (n1 - n2));
                break;
            case 3:
                System.out.print("Answer is:" + (n1 * n2));
                break;
            case 4:
                System.out.print("Answer is:" + (n1 / n2));
                break;
            default:
                System.out.print("Select just from 4 operators!");
                break;
        }
        input.close();

    }
}