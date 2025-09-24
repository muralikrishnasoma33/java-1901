package OOPS_Inheritance;

public class MainLms {
    public static void main(String[] args) {
        
    
    Student s1 = new Student(101,"Murali Krishna", 23, 768783726, "I have Promo Code", 25000);
    s1.displayInfo();

    s1.calculateCourseFee();
    System.out.println("Average Score :"+s1.avgScore());

    System.out.println("Sessions Attended :"+s1.sessionsAttendedCredits());

    System.out.println("Final Achievement :"+s1.finalAchievement());



    Trainer t1 = new Trainer(201, "Ravi Krishna", 37, 781766299);
    System.out.println("Trainer total Payment :"+t1.trainerTotalPayments());




    }
    

}
