package Strings;

public class Main {
    public static void main(String[] args) {
        
    
    Student s1 = new Student(101,"Murali Krishna");
    Student s2 = new Student(101,"Murali","7330742033",23,"I have Promo Code",30000);

    System.out.println("==========Student Basic Details===========");
    s1.StudentInfo();

    System.out.println("==========Student Full Details===========");
    s2.studentFullDetails();

    System.out.println("===========Course Fee==========");
    s2.calculateCourseFee();
    //s1.avgScore();
    System.out.println("=====Attendance Credits=====");
    System.out.println("Attendance Credits :"+s1.sessionsAttendedCredits());
    System.out.println("=====Performance Credits=====");
    System.out.println("Performance Score :"+s1.performanceScoreCredits());
    System.out.println("=====Final Achievement====="); 
    System.out.println("Final Achievement :"+s1.finalAchievement());

    System.out.println("\n");
    Trainer t1 = new Trainer(201,"Ravi Krishna");

    Trainer t2 = new Trainer(201,"Ravi Krishna","8797965432",30);
    System.out.println("==========Trainer Basic Details=========="); 
    t1.trainerInfo();
    System.out.println("=====Trainer Full Details=====");
    t2.trainerFullDetails();

    //System.out.println("Trainer Session Based Payment :"+t1.trainerSessionBasedPayment());
    System.out.println("==========Trainer Total Paymen==========t");
    System.out.println("Trainer Total Payment :"+t1.trainerTotalPayments());

    }
}
