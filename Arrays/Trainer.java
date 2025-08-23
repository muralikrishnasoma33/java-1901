package Arrays;
import java.util.Scanner;


public class Trainer {
    int trainerId;
    String trainerName;

    String trainerMobileNumber;
    int trainerAge;

    int sessionsTaken;
    int sessionBasedPayment;
    int trainerTotalPayment;

    //Using Constructor to set values for trainer ID and Name(Basic Details)
    //Basic Details --> Hover like Myntra
    public Trainer(int trainerId,String trainerName){
        this.trainerId = trainerId;
        this.trainerName = trainerName;
    }
    
    //Using Constructor to Set values for trainer Full Details
    //Full Details --> Click Like in myntra
    public Trainer(int trainerId,String trainerName,String trainerMobileNumber,int trainerAge){
        // this.trainerId = trainerId;
        // this.trainerName = trainerName;
        this(trainerId, trainerName); //Constructor Call( this() )
        this.trainerMobileNumber = trainerMobileNumber;
        this.trainerAge = trainerAge;
    }
    
    Scanner sc = new Scanner(System.in);

    public void trainerInfo(){
        System.out.println("Enter Trainer Id :"+trainerId);
        System.out.println("Enter Trainer Name :"+trainerName);
    }

    public void trainerFullDetails(){
        System.out.println("Enter Trainer Id :"+trainerId);
        System.out.println("Enter Trainer Name :"+trainerName);
        System.out.println("Enter Trainer Mobile NUmber :"+trainerMobileNumber);
        System.out.println("Enter Trainer Age :"+trainerAge);
    }

    public int trainerSessionBasedPayment(){
        System.out.println("Enter Number Sessions Taken");
        sessionsTaken = sc.nextInt();
        sessionBasedPayment = sessionsTaken * 1500;
        return sessionBasedPayment;
    }

    public int trainerTotalPayments(){
        System.out.println("Enter Student ratings");
        int studentRatings = sc.nextInt();
        if(studentRatings>=5){
            trainerTotalPayment = trainerSessionBasedPayment() + 5000;
            return trainerTotalPayment;
        }else {
            trainerTotalPayment = trainerSessionBasedPayment() + 0;
            return trainerTotalPayment;
        }
    }
}