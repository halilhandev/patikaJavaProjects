import java.util.Scanner;
public class passTheClass {
    public static void main(String[] args) {
        int math, phys, turk, che, msc;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mathematics grade: ");
        math = input.nextInt(); 
        System.out.print("Enter the physics grade: ");
        phys = input.nextInt();
        System.out.print("Enter the turkish grade: ");
        turk = input.nextInt();
        System.out.print("Enter the chemistry grade: ");
        che = input.nextInt();
        System.out.print("Enter the music grade: ");
        msc = input.nextInt();
        
        if (math > 0 && math < 100 && phys > 0 && phys < 100 && turk > 0 && turk < 100 && che > 0 && turk < 100 && msc > 0 && msc < 100) {
            average = (math + phys + turk + che + msc) / 5;
            if (average >= 55) {
                System.out.print("Your grade is" + average + ". Congratulations! You passed.");
            } else {System.out.print("You failed. Your grade is " + average);}
        } else {System.out.print("Please enter a number between 0-100!");} 
        input.close(); 
    }
}
