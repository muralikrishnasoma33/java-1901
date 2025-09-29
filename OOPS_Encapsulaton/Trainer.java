package OOPS_Encapsulaton;
import java.util.Scanner;

  public class Trainer extends Person {
    

    private int sessionsTaken;
    private int sessionBasedPayment;
    private int trainerTotalPayment;


    //Setters & Getters
    public int getSessionsTaken() {
        return sessionsTaken;
    }

    public void setSessionsTaken(int sessionsTaken) {
        this.sessionsTaken = sessionsTaken;
    }

    public int getSessionBasedPayment() {
        return sessionBasedPayment;
    }

    public void setSessionBasedPayment(int sessionBasedPayment) {
        this.sessionBasedPayment = sessionBasedPayment;
    }

    public int getTrainerTotalPayment() {
        return trainerTotalPayment;
    }

    public void setTrainerTotalPayment(int trainerTotalPayment) {
        this.trainerTotalPayment = trainerTotalPayment;
    }

    // static{
    //     System.out.println("Institute Name :"+Student.instituteName);
    //     System.out.println("Subject Name :"+Student.courseName);
    // }

    // //Using Constructor to set values for trainer ID and Name(Basic Details)
    // //Basic Details --> Hover like Myntra
    // public Trainer(int trainerId,String trainerName){
    //     this.trainerId = trainerId;
    //     this.trainerName = trainerName;
    
    
    //Using Constructor to Set values for trainer Full Details
    //Full Details --> Click Like in myntra
    // public Trainer(int trainerId,String trainerName,int trainerAge,int trainerMobileNumber){
    //     // this.trainerId = trainerId;
    //     // this.trainerName = trainerName;
        
    //     super(trainerId, trainerName, trainerAge, trainerMobileNumber);
    // }
    
    Scanner sc = new Scanner(System.in);

    // public void trainerInfo(){
    //     System.out.println("Enter Trainer Id :"+trainerId);
    //     System.out.println("Enter Trainer Name :"+trainerName);
    // }

    // public void trainerFullDetails(){
    //     System.out.println("Enter Trainer Id :"+trainerId);
    //     System.out.println("Enter Trainer Name :"+trainerName);
    //     System.out.println("Enter Trainer Mobile NUmber :"+trainerMobileNumber);
    //     System.out.println("Enter Trainer Age :"+trainerAge);
    // }

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