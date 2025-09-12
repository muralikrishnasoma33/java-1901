package StaticAndNonStatic;

public class MainLms {

    public static void main(String[] args) {

     StudentLms s1 = new StudentLms(101,"Murali");
     StudentLms s2 = new StudentLms(101,"Murali","765848585",23,"I have reference from lecturer",28000);
     System.out.println("==========Student Basic Details==========");
     s1.StudentInfo();

     System.out.println("==========Student Full Details==========");
     s2.studentFullDetails();

     System.out.println("==========Course Fee==========");
     s2.calculateCourseFee();

    // System.out.println("==========Average Score==========");
    // System.out.println("Average Score :"+s2.avgScore());

    System.out.println("==========Sessions Credits==========");
    System.out.println("Sessions Credits :"+s2.sessionsAttendedCredits());

    System.out.println("==========Performance Credits=========");
    System.out.println("Performance Credits :"+s2.performanceScoreCredits());
    System.out.println("==========Final Credits==========");
    System.out.println("Final Achievement :"+s2.finalAchievement());


    TrainerLms t1 = new TrainerLms(201, "Ravi Krishna");
    TrainerLms t2 = new TrainerLms(201,"Ravi Krishna","7167989171",34);


    System.out.println("==========Trainer Basic Details==========");
    t1.trainerInfo();

    System.out.println("==========Trainer Full Details==========");
    t2.trainerFullDetails();

    // System.out.println("==========Trainer Session Based Payment===========");
    // System.out.println(t2.trainerSessionBasedPayment());

    System.out.println("==========Trainer Total Payment==========");
    System.out.println(t2.trainerTotalPayments());
}
}
