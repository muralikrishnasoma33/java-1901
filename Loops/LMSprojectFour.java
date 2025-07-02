package Loops;
import java.util.Scanner;
public class LMSprojectFour {
    public static void main(String[] args) {
    
        //Collect Student information
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID");
        int studentId = scanner.nextInt();

        System.out.println("Enter Student Name");
        scanner.nextLine();
        String studentName = scanner.nextLine();

        double attendance = 85;
        int totalScore = 0;
        int numberOfSubjects = 0;

        //store input given from student
        char continueInput = 'y';
        
        //why not FOR loop? : which students will input how many subject scores
        while(continueInput == 'y' || continueInput == 'Y'){
            System.out.println("Enter Score For Subject :"+(numberOfSubjects+1));
            int currentScore = scanner.nextInt();
            numberOfSubjects++; //increment

            totalScore+=currentScore; //add each currentscore to TotalScore
            System.out.println("Do You Want to Enter another Score?:(Yes/No)");
            continueInput = scanner.next().charAt(0);
        }
        
        //average Score
        double averageScore = totalScore/numberOfSubjects;

        String performance;
        if(averageScore >= 85){
            performance = "Excellent";
        }else if(averageScore >= 70){
            performance = "Good";
        }else if(averageScore >= 60){
            performance = "Average";
        }else{
            performance = "Needs Improvement";
        }

        //attendance
        String attendanceStatus = attendance < 75 ? "Warning for low attendace" : "Has Good attendance";
        
        System.out.println("Student ID : "+studentId);
        System.out.println("Enter Student Name : "+studentName);
        System.out.println("Total Score : "+totalScore);
        System.out.println("Average Score : "+averageScore);
        System.out.println("Performance : "+performance);
        System.out.println("Attendance : "+attendanceStatus);
        
        scanner.close();

    }
}
    
        