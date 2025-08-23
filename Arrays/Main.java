package Arrays;
public class Main{
public static void main(String[] args){
    Student s1 = new Student(190,"Ravi");
    Student s2 = new Student(190,"Ravi","8976548790",56);
    // s1.studentId = 1901;
    // s1.studentName = "Ravi";
    
    s1.StudentInfo();
    System.out.println("==========Full Details==========");
    s2.studentFullDetails();

    System.out.println("Sessions Attended Credits :"+s1.sessionsAttendedCredits());

    System.out.println("Average Score Credits:"+s1.performanceScoreCredits());

    System.out.println("Final Reports :"+s1.finalAchievement());  
    System.out.println("\n");
    
    Trainer t1 = new Trainer(191,"Murali");
    Trainer t2 = new Trainer(191,"Murali","7865489678",24);
    // t1.trainerId = 1902;
    // t1.trainerName = "Murali";

    t1.trainerInfo();
    System.out.println("==========Full Details==========");
    t2.trainerFullDetails();
    System.out.println("Trainer Total Payment :"+t1.trainerTotalPayments());

    }
}