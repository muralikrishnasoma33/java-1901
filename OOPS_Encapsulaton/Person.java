package OOPS_Encapsulaton;

public class Person {
    private int personId;
    private String personName;
    private int personAge;
    private int personMobileNumber;

    // Getters & Setters
    public int getPersonID(){
        return personId;
    }

    public void setPersonID(int personId){
        if(personId >= 100){
            this.personId =personId;
        }else{
            System.out.println("Invalid ID Given");
        }
    }

    public String getPersonName(){
        return personName;
    }

    public void setPersonName(String personName){
        this.personName = personName;
    }

    public int getPersonAge(){
        return personAge;
    }

    public void setPersonAge(int personAge){
        if(personAge > 0){
            this.personAge = personAge;
        }else{
            System.out.println("Invalid Age Given");
        }
    }

    public int getPersonMobileNumber(){
        return personMobileNumber;
    }

    public void setPersonMobileNumber(int personMobileNumber){
        this.personMobileNumber = personMobileNumber;
    }


    public void displayInfo(){
        System.out.println( "ID :"+getPersonID());
        System.out.println("Name :"+getPersonName());
        System.out.println("Age :"+getPersonAge());
        System.out.println("Mobile Number :"+getPersonMobileNumber());
    }

}
