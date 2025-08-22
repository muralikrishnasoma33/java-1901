package ClassesObjects;

public class Main {
    public static void main(String[] args){
    Student s1 = new Student();

    s1.studentId = 1901;
    s1.studentName = "Ravi";
    
    s1.StudentInfo();

    System.out.println("Attendance Credits :"+s1.sessionsAttendedCredits());   

    System.out.println("Performance Credits :"+s1.performanceScoreCredits(80));
 
    System.out.println("Final Reports :"+s1.finalAchievement());  
    
    
    Trainer t1 = new Trainer();

    t1.trainerId = 1902;
    t1.trainerName = "Murali";

    t1.trainerInfo();
    
    System.out.println(t1.trainerTotalPayments());

    }



}
