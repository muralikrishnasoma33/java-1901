package OOPS_Encapsulaton;

public class Demo {
    private String name = "Murali Krishna";
    private int age = 23;
    private int mobileNumber = 746828738;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        
        if(newName != null && !newName.isEmpty()){
            name = newName;
        }else{
            System.out.println("Invalid Name Given");
        }

    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        if(age > 0){
           age = newAge;
        }else {
            System.out.println("Invalid Age Given");
        }
    }
    public int getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(int newMobileNumber) {
        if(String.valueOf(newMobileNumber).length() == 9){
            mobileNumber = newMobileNumber;
        }else {
            System.out.println("Invalid Number Provided");
        }
    }

    
}
