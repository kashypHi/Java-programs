//find total marks of all the student obtained in all subjects

import java.util.Scanner;

class Student_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double marks[] = new double[5];
        double sum=0,per=0,count=0,max=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("ENTER YOUR MARKS: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("====================");

        for (int i = 0; i < 5; i++) {
            sum = sum+marks[i];
        }
        System.out.println("Sum of marks : " + sum);
        
        for (int i = 0; i < 5; i++) {
            per=sum/500*100;
        }
        System.out.println("per of marks : " + per);
        
        for (int i = 0; i < 5; i++) {
             if(marks[i]<35){
                 count++;
             }
        }
        System.out.println("Fail:" +count);

        for(int i = 0;i<5;i++) {
            if (marks[i]>max);
            max=marks[i];
        }
        System.out.println("maximum marks: " + max);

        for (int i = 0; i < 5; i++) {

             if(marks[i]>60){
                 count++;
             }
        }
        System.out.println("marks obtained more than 60 :" +count);

        sc.close();
            }
    }
