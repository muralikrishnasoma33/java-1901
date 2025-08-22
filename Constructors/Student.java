package Constructors;
import java.util.Scanner;
    public class Student {
       int studentId;
       String studentName;

       String studentMobileNumber;
       int studentAge;

       int attendanceCredits;
       int performanceCredits;
       int totalCredits;

       //Constructors are Using for set values to student Id,Name
       //Basic Details --> Hover like Myntra
       public Student(int studentId,String studentName){
          this.studentId = studentId;
          this.studentName = studentName;
       }
      //Constructors are Using for set values to student Full Details
      //Full Details --> Click Like in myntra
      public Student(int studentId,String studentName,String studentMobileNumber,int studentAge){
         //  this.studentId = studentId;
         //  this.studentName = studentName;
         this(studentId, studentName);
         this.studentMobileNumber = studentMobileNumber;
         this.studentAge = studentAge;
      }
      
    public void StudentInfo(){
      System.out.println("Student ID :"+studentId);
      System.out.println("Student Name :"+studentName);
   }

   public void studentFullDetails(){
      System.out.println("Student ID :"+studentId);
      System.out.println("Student Name :"+studentName);
      System.out.println("Student Mobile Number :"+studentMobileNumber);
      System.out.println("Student Age :"+studentAge);
   }
   
   

   Scanner sc = new Scanner(System.in);
   public int sessionsAttendedCredits(){
     System.out.println("Enter Number of sessions Attended");
     int sessionsAttended = sc.nextInt();
     if(sessionsAttended>=30){
        return attendanceCredits+=5;
     }else if(sessionsAttended<=29){
        return attendanceCredits+=3;
     }else {
        return attendanceCredits+=0;
     }
   }

   public int performanceScoreCredits(int performanceScore){
       if(performanceScore>=85){
         return performanceCredits+=5;
       }else if(performanceScore<=84){
         return performanceCredits+=3;
       }else{
         return performanceCredits+=0;
       }
   }

   public String finalAchievement(){
      totalCredits = attendanceCredits + performanceCredits;
      if(totalCredits>=10){
         return "Gold";
      }else if(totalCredits<=9){
         return "Silver";
      }else {
         return "You Need To Improve";
      }
   }
}

