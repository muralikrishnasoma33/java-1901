package OOPS_Inheritance;

public class Person {
    
    int personID;
    String personName;
    int personAge;
    int personMobileNumber;

    Person(){

    }

    Person(int personID, String personName, int personAge, int personMobileNumber){
        this.personID = personID;
        this.personName = personName;
        this.personAge = personAge;
        this.personMobileNumber = personMobileNumber;

    }

    public void displayInfo(){
        System.out.println("ID :"+personID);
        System.out.println("Name :"+personName);
        System.out.println("Age :"+personAge);
        System.out.println("Mobile Number : "+personMobileNumber);
    }
}
