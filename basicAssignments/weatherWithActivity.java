import java.util.Scanner;
public class weatherWithActivity {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the heat degree without unit: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("You can ski.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("You can go to the cinema.");
            }
            if (heat >= 10) {
                System.out.println("You can have a picnic.");
            }
        } else {
            System.out.println("You can go swimming.");
        }
        input.close();
    }
}
