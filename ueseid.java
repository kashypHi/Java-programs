import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;

public class ueseid {
    public static void main(String[]args)
    {
        Scanner search = new Scanner(System.in);

        System.out.print("Enter username");
        String user = search.nextLine();

        System.out.print("enter password");
        int pwd = search.nextInt();

        int password = 1234;
        if(user == "RAGHAV" && pwd == password)
        {
            System.out.println("login sucess");
            
        }
        else {
            System.out.println("wrong password");
        }
    
        search.close();

    }
}
