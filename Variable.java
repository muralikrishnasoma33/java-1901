public class Variable {
    // static variable
    static int numb;
    
    //Instance variable
    int num;
    public void displayNumber()
    {
      System.out.println(num);
    }
    //Local variable
    public static void main(String[] args)
    {
        //int number;
        //System.out.println(number);
        System.out.println(numb);
            
    } 
}
              // In this program we used three types of variables
              // 1 : Static variable   - We must initiaze
              // 2 : Instance variable - No need to initiaze variable in non-static method
              // 3 : Local variable    - We must initiaze variables