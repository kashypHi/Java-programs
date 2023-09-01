import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String movies[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("ENTER YOUR MOVIE NAME : ");
            movies[i] = sc.nextLine();
        }

        System.out.println("====================");

        for (int i = 0; i < 5; i++) {
            System.out.println(movies[0] +" ");
        }
        sc.close();

    }
}


/* find total marks of all the student obtained in all subjects
find percentage of a student
find the subject in which student is fail (marks<35)
find the subject in which student has got highest marks
count the no of subject in which student has got more than 60*/