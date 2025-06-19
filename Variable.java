

public class Variable {
    static int numb; // static variable - we can use static variable without initialization
    int num; //Instance variable - we can use this variable without initiazation in non-static methods
    
    // non-static method
    public void displayNumber(){
        System.out.println(num); 
    }

    public static void main(String[] args)
    {
       int number;
       //System.out.println(number);
       System.out.println(numb);
    }
}
