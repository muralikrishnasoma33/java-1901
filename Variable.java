

public class Variable {
    static int numb; // static variable - we can use static variable without initialization
    int num; //Instance variable - we can use this variable without initiazation in non-static methods
    
    // non-static method
    public void displayNumber(){
        System.out.println(num); 
    }

    public static void main(String[] args)
    {
       int number; // local variable - we have to iniatilize in main method
       System.out.println(number); // It will give error.Because we didnot initiaze for number variable
       System.out.println(numb);
    }
}
// Three Variables are defined here
//   1 : static variable   (need not to initiaze)
//   2 : instance variable (need not to initiaze in non static method)
//   3 : local variable    (it will be in the main method,and we must initiaze)
