package ClassesObjects;

import java.util.Scanner;
public class Student {
    int studentId;
    String studentName;
    int attendanceCredits;
    int performanceCredits;
    int totalCredits;
      
   

   public void StudentInfo(){
      System.out.println("Student ID :"+studentId);
      System.out.println("Student Name :"+studentName);
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