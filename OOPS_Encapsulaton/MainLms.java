package OOPS_Encapsulaton;
import java.util.Scanner;
public class MainLms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("Enter Student Id : ");
        //101sc.nextInt();
        s1.setPersonID(sc.nextInt());
        
        System.out.println("Enter Student Name : ");
        sc.nextLine();
        s1.setPersonName(sc.nextLine());
        

        System.out.println("Enter Student Age : ");
        s1.setPersonAge(sc.nextInt());


        System.out.println("Enter Student Mobile Number : ");
        s1.setPersonMobileNumber(sc.nextInt());

        System.out.println("Enter Student Description : ");
        sc.nextLine();
        s1.setStudentDescription(sc.nextLine());

        System.out.println("Enter Student Course Fee : ");
        s1.setCourseFee(sc.nextDouble());

        s1.displayInfo();

        s1.calculateCourseFee();

        System.out.println("Average Score :"+s1.avgScore());
        System.out.println("Sessions Attended :"+s1.sessionsAttendedCredits());
        System.out.println("Final Achievement :"+s1.finalAchievement());

        Trainer t1 = new Trainer();

        System.out.println("Enter Trainer ID :");
        t1.setPersonID(sc.nextInt());

        System.out.println("Enter Trainer Name :");
        sc.nextLine();
        t1.setPersonName(sc.nextLine());

        System.out.println("Enter Trainer Age :");
        t1.setPersonAge(sc.nextInt());

        System.out.println("Enter Trainer Mobile Number");
        t1.setPersonMobileNumber(sc.nextInt());

        t1.displayInfo();

       System.out.println("Trainer total Payment :"+t1.trainerTotalPayments());

       sc.close();

        
    }
}
