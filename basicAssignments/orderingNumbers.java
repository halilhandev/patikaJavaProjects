import java.util.Scanner;
public class orderingNumbers {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        x = input.nextInt();

        System.out.print("Second number: ");
        y = input.nextInt();

        System.out.print("Third number: ");
        z = input.nextInt();

        if (x>y && x>z) {
            if (y > z) {
                System.out.print("x > y > z");
            } else {
                System.out.print("x > z > y");
            }
        }    
        if (y>x && y>z) {
            if (x>z) {
                System.out.print("y > x > z");
            } else {
                System.out.print("y > z > x");
            }
        } else {
            if (x > y) {
                System.out.print("z > x > y");
            } else {
                System.out.print("z > y > x");
            }
        }
        input.close();
    }
}
