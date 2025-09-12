package StaticAndNonStatic;

import java.util.Scanner;

public class StudentLms {
       int studentId;
       String studentName;

       String studentMobileNumber;
       int studentAge;

       String studentDescription;
       double courseFee;

       int attendanceCredits;
       int performanceCredits;
       int totalCredits;

       //Taking 5 Subjects Scores
       int [] subjectScores;

       //Static Varibles
         static String courseName = "Java";
         static  String instituteName = "Digital Edify";
         static double globalDiscount = 0.1;

       //Static for setting coursename,institutename,global discount
       static{
          System.out.println("==========Institute Details==========");
          System.out.println("Welcome to :"+instituteName);
          System.out.println("Current Course Attending :"+courseName);
          System.out.println("You got Discount :"+globalDiscount);
       }

       //Constructors are Using for set values to student Id,Name
       //Basic Details --> Hover like Myntra
       public StudentLms(int studentId,String studentName){
          this.studentId = studentId;
          this.studentName = studentName;
       }
      //Constructors are Using for set values to student Full Details
      //Full Details --> Click Like in myntra
      public StudentLms(int studentId,String studentName,String studentMobileNumber,int studentAge,String studentDescription,double courseFee){
         //  this.studentId = studentId;
         //  this.studentName = studentName;
         this(studentId, studentName);
         this.studentMobileNumber = studentMobileNumber;
         this.studentAge = studentAge;
         this.studentDescription = studentDescription;
         this.courseFee = courseFee;
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
      System.out.println("Student Description :"+studentDescription);
      System.out.println("Student CourseFee :"+courseFee);
      
   }

   Scanner sc = new Scanner(System.in);
   
   //Calculating Course Fee
   public void calculateCourseFee(){
      double discount = 0;
      String description = studentDescription.toLowerCase();
      if(description.contains("reference")){
          discount += 5000;
      }if(description.contains("scholarship")){
        discount += 7000;
      }if(description.contains("promo")){
        discount += 3000;
      }

      discount = courseFee * globalDiscount;
     //Calculate Final Fee
     double finalFee = courseFee - discount; 
     System.out.println("Original Course Fee :"+courseFee);
     System.out.println("Dicounted Fee :"+discount);
     System.out.println("Global Discount :"+globalDiscount);
     System.out.println("Final Fee :"+finalFee);
   }
    
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

