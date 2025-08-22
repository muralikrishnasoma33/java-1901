package ClassesObjects;
import java.util.Scanner;


public class Trainer {
    int trainerId;
    String trainerName;
    int sessionsTaken;
    int sessionBasedPayment;
    int trainerTotalPayment;
    
    Scanner sc = new Scanner(System.in);

    public void trainerInfo(){
        System.out.println("Enter Trainer Id :"+trainerId);
        System.out.println("Enter Trainer Name :"+trainerName);
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
