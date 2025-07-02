package Loops;
import java.util.Scanner;

public class Demoprograms {
   public static void main(String[] args)
   {
     for(int i=1; i<=8; i++){
        System.out.println("Hello World : "+i);
     if(i==4){
        break;
     }
     } 
     
     for(int i=1;i<=5;i++){
        if(i==3){
        continue;
     }
        System.out.println("Filling Water Bottle : "+i);  
     }

     //while
     //waterbottle sips =5
     int waterInbottle = 5;
     System.out.println("drinking Water");
     while(waterInbottle>0){
            System.out.println("Took a Sip,Remaining Sips:" +(waterInbottle-1));
            waterInbottle--;
     }

     //Do While
     int pin = 8901;
     do {
        System.out.println("welcome To SBI ATM");
     }while (pin==8900); 

     //Scanner
     Scanner input = new Scanner(System.in);
     System.out.println("Enter your ID :");
     int id = input.nextInt();

     System.out.println("Enter Your Name :");
     String name = input.nextLine();

     System.out.println("Hi "+name +"Your id is :"+id);
     System.out.println("Work has Completed stop taking input");
     input.close();
  }
}