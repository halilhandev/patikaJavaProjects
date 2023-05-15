import java.util.Scanner;

public class HypoCalculator {
    // İbrahim Halil Han
    public static void main(String[] args) {
        int a, b;
        double c;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side of triangle: ");
        a = input.nextInt();
        System.out.print("Enter the second side of triangle: ");
        b = input.nextInt();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse of the triangle is: " + c);
        
        
        input.close();
    }
    
}