package LMSProjectTwo;

public class ProjectTwo {
    public static void main(String[] args)
    {
        //Declared Variables
        int studentId = 202;
        String studentName = "Krishna";
        short studentAge = 20;
        double scoreForQuiz = 80;
        double scoreForAssignment = 90;
        double scoreForexam = 80;
        double attendance = 80;

        //Arithmetic Ops
        double totalScore = scoreForQuiz+scoreForAssignment+scoreForexam;
        
        double averageScore = totalScore/3;
        
        //Using Relational Operators
        boolean isPassing = averageScore>=80;
       
        
        //Using Increment Operator
        attendance++;

        //Using Logical Operator
        boolean isQualified = isPassing && attendance>=75;



        System.out.println("Student ID                          : "+studentId); 
        System.out.println("Student Name                        : "+studentName);
        System.out.println("Student age                         : "+studentAge);

        System.out.println("Total Score                         : "+totalScore);
        System.out.println("Average Score                       : "+averageScore);
        
        System.out.println("Student after Attending the college : "+attendance++);
        System.out.println("Is Passing                          : "+isPassing);
        System.out.println("Is Qualified                        : "+isQualified);

    }
    
}
    

