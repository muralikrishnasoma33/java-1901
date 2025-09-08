package Strings;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
        //Length Method (Username)  & toLowerCase Method (  Gmail Functionality (Given name should converted into lowercase)   )
           Scanner u1 = new Scanner(System.in);
           System.out.println("Enter Username :");
           String userName = u1.nextLine();
           if(userName.length()>=4){
              String formattedUserName = userName.toLowerCase();
              System.out.println("Original : "+userName);
              System.out.println("Formatted  : "+formattedUserName);
           }else{
              System.out.println("Username Invalid");
           }

        //CharAt Method(Male or Female)          
           System.out.println("Enter Gender :" );
           String gender = u1.nextLine();
           if(gender.charAt(0)=='M' || gender.charAt(0)=='m' || gender.charAt(0)=='F' || gender.charAt(0)=='f'){
              System.out.println("Valid Option");
           }else{
              System.out.println("Invalid Option");
           }

        //equals() Method ( Reset Password Functionality )
           System.out.println("Enter Password ");
           String passWord = u1.nextLine();
           
           System.out.println("Re-enter The Password");
           String passWordMatched = u1.nextLine();
           //Check The condition
           if(passWord.equals(passWordMatched)){
              System.out.println("PassWord Changed Successfully");
           }else {
              System.out.println("PassWord Not Matched,Retry");
           }
        
         //toUpperCase Method ( PAN Card Functionality )
            System.out.println("Enter PAN : ");
            String pan = u1.nextLine();
            System.out.println("Original :"+pan);
            System.out.println("Formatted :"+pan.toUpperCase());

         //Contains Method (email Functinality)
            System.out.println("Enter Email ");
            String email = u1.nextLine();
            if(email.contains("@")){
               System.out.println("Valid");
            }else{
               System.out.println("Invalid");
            }

         //StartsWith Method (Country Codes)
            System.out.println("Enter Mobile Number :");
            String mobileNumber = u1.nextLine();

            if(mobileNumber.startsWith("+91")){
               System.out.println("Call Connected to INDIA");
            }else if(mobileNumber.startsWith("+1")){
               System.out.println("Call Connected to USA");
            }else if(mobileNumber.startsWith("+86")){
               System.out.println("Call Connected to CHINA");
            }else {
               System.out.println("You can Call only to INDIA, CHINA, USA");
            }
            u1.close();
    }

}
