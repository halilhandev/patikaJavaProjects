import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName, password, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the username: ");
        userName = input.nextLine();
        System.out.print("Enter the password: ");
        password = input.nextLine();

        if (userName.equals("dragon") && password.equals("dragon123")){
            System.out.print("Login Successful!");
        } else {
            System.out.print("Password was wrong. Could you want to change the password?('Y' or 'y'): ");
            select = input.nextLine();
            if (select.equals("Y") || select.equals("y")) {
                System.out.print("Type your new password: ");
                String newPass = input.nextLine();
                password = newPass;
                if (newPass.equals("dragon123")) {
                    System.out.print("Your new password can not be the same as before!");
            }   else {System.out.print("Your password changed succesfully.");}
        }
        }
        
        input.close();
    }
}
