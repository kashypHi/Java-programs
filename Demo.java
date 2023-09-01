import java.util.Scanner;

// Write a java program to take a input from user as a username and password and match with your previous username and password.

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "Himanshu";
        String password = "Abc@1234";

        System.out.println("Enter the username: ");
        String user = scan.next();

        System.out.println("Enter the password: ");
        String pass = scan.next();

        if(username.equals(user) && password.equals(pass)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Wrong Username or password");
            }
        
        scan.close();
    }
}
