package Arrays;

import java.util.Scanner;


    public class Student {
       int studentId;
       String studentName;

       String studentMobileNumber;
       int studentAge;

       int attendanceCredits;
       int performanceCredits;
       int totalCredits;

       //Taking 5 Subjects Scores
       int [] subjectScores;

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
    
   public int avgScore(){
       System.out.println("Enter Number Of Subjects");
       int numOfSubjects = sc.nextInt();
       //initialize array with numOfSubjects
       subjectScores = new int[numOfSubjects];

       int totalScore = 0;

       for(int i=0;i<subjectScores.length;i++){
           System.out.println("Enter Score For Subject :"+(i+1));
           subjectScores[i] = sc.nextInt();
           totalScore += subjectScores[i];
       }

       int averageScore = (totalScore) / subjectScores.length;
       return averageScore;
       
   }
   

   
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
   
   public int performanceScoreCredits(){
       int averageScore = avgScore();
       if(averageScore>=85){
         return performanceCredits+=5;
       }else if(averageScore<=84){
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