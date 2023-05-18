import java.util.Scanner;

public class GroceryStoreProgram {
    public static void main(String[] args) {
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplnt = 5.00;
        System.out.println("Welcome to the Grocery Store!");
        Scanner input = new Scanner(System.in);
        System.out.print("How many kilos of pears?: ");
        double pearPrc = input.nextDouble();
        System.out.print("How many kilos of apples?: ");
        double appPrc = input.nextDouble();
        System.out.print("How many kilos of tomatoes?: ");
        double tmtPrc = input.nextDouble();
        System.out.print("How many kilos of bananas?: ");
        double bananaPrc = input.nextDouble();
        System.out.print("How many kilos of eggplants?: ");
        double eggplntPrc = input.nextDouble();

        double total = pear * pearPrc + apple * appPrc + tomato * tmtPrc + banana * bananaPrc + eggplnt * eggplntPrc;
        System.out.print("Total price: " + total);

        input.close();
    }
}
