package LMSprojects;

public class Task {
    public static void main(String[] args){

    System.out.println("=============APPLICATION FOR COLLEGE ADMISSION TEST=============");
    System.out.println('\n');
    boolean isFirstYear = true;
    boolean isTransferee = false;
    boolean isReturnee = false;
    
    //Student info
    String lastName = "Soma";
    String firstName = "Murali Krishna";
    String middleName = "----";
    String completeAddress = "Gokul Plots, Kukatpally, Hyderabad";
    String birthPlace = "Kadapa";
    String dateOfBirth = "01-01-2003";
    String citizenship = "Indian";
    String civilStatus = "Single";
    String sex = "Male";
    long contactNumber = 78422396733l;
    String nameOfSpouse = "None";
    String contactNumberOfSpouse = "None";
     
    // Parents Details
    //Father Details
    String fatherName = "Venkata Subbaiah";
    String hisOccupation = "Weaver";
    long mobileNum = 9859826065l;

    //Mother Details
    String motherName = "Lakshmi";
    String herOccupation = "Weaver";
    long mobilenumb = 6278682787l; 


    //Guardian Details
    String guardianName = "Nagendra";
    long guardianContact = 8625368767l;
    String guardianAddress = "None";

    System.out.println("IsFirstYear                  : "+isFirstYear);
    System.out.println("IsTransferee                 : "+isTransferee);
    System.out.println("IsReturnee                   : "+isReturnee);
    System.out.println("Last Name                    : "+lastName);
    System.out.println("First Name                   : "+firstName);
    System.out.println("Middle Name                  : "+middleName);
    System.out.println("Complete Address             : "+completeAddress);
    System.out.println("Birth Place                  : "+birthPlace);
    System.out.println("Date Of Birth                : "+dateOfBirth);
    System.out.println("Citizenship                  : "+citizenship);
    System.out.println("Civil Status                 : "+civilStatus);
    System.out.println("Gender                       : "+sex);
    System.out.println("Contact Number               : "+contactNumber);
    System.out.println("Name of Spouse               : "+nameOfSpouse);
    System.out.println("Contact Number of spouse     : "+contactNumberOfSpouse);
    System.out.println("Father name                  : "+fatherName);
    System.out.println("His Occupation               : "+hisOccupation);
    System.out.println("Father Mobile number         : "+mobileNum);
    System.out.println("Mother Name                  : "+motherName);
    System.out.println("Mother Occupation            : "+herOccupation);
    System.out.println("Mother Mobile Number         : "+mobilenumb);
    System.out.println("Guardian Name                : "+guardianName);
    System.out.println("Guardian Contact             : "+guardianContact);
    System.out.println("Guadian Address              : "+guardianAddress);
    
 }
}

