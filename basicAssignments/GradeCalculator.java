import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        int math, phys, che, turk, hist, msc;

        Scanner inputGrade = new Scanner(System.in);

        System.out.print("Enter the math grade: ");
        math = inputGrade.nextInt();

        System.out.print("Enter the physics grade: ");
        phys = inputGrade.nextInt();

        System.out.print("Enter the chemistry grade: ");
        che = inputGrade.nextInt();

        System.out.print("Enter the turkish grade: ");
        turk = inputGrade.nextInt();

        System.out.print("Enter the history grade: ");
        hist = inputGrade.nextInt();

        System.out.print("Enter the music grade: ");
        msc = inputGrade.nextInt();

        int total = (math + phys + che + turk + hist + msc);
        double finalGrade = total / 6.0;

        System.out.println("Your total grade is " + finalGrade);

        inputGrade.close();
    }
}