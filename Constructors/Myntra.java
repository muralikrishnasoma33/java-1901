package Constructors;

public class Myntra {

    String name;
    String fullName;
    String mobileNumber;
    String emailId;
    String location;
    
    public Myntra(){
        name = "Murali";
    }

    public Myntra(String fullName,String mobileNumber,String emailId,String location){
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.location = location;
    }

    public static void main(String[] args) {
        
        Myntra m1 = new Myntra();
        System.out.println("Hovering On :"+m1.name);
        System.out.println("\n");
        Myntra m2 = new Myntra("Murali Krishna","7330897652","murali99@gmail.com","Hyderabad");
        System.out.println("When Clicked");
        System.out.println("\n");
        System.out.println("Full Name :"+m2.fullName);
        System.out.println("Mobile Number :"+m2.mobileNumber);
        System.out.println("Email Id :"+m2.emailId);
        System.out.println("Location :"+m2.location);


    }
}
