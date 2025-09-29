package OOPS_Encapsulaton;

public class DemoMain {
    public static void main(String[] args) {
        Demo d1 = new Demo();
    
        //Original Data (getters for getting original data)
        System.out.println("Original Name          :"+d1.getName());
        System.out.println("Original Age           :"+d1.getAge());
        System.out.println("Original Mobile Number :"+d1.getMobileNumber());


        // Updated Values (setters for update/ validate the original data)
        d1.setName("Tirumala");
        d1.setAge(20);
        d1.setMobileNumber(897654678);

        //Updated Data 
        System.out.println("==========Updated Data===========");
        System.out.println("Updated Name          :"+d1.getName());
        System.out.println("Updated Age           :"+d1.getAge());
        System.out.println("Updated Mobile Number :"+d1.getMobileNumber());
        
    

    }
}
