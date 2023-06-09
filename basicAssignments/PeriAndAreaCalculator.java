import java.util.Scanner;

public class PeriAndAreaCalculator {
    public static void main(String[] args) {
        int r, c;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r = input.nextInt();
        System.out.println("Enter the center angle of the circle: ");
        c = input.nextInt();
        System.out.println("Perimeter of the circle: " + 2 * pi * r);
        System.out.print("Area of the circle: " + (pi * r*r * c) / 360);

        input.close();
    }
}