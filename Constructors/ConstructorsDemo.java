package Constructors;

public class ConstructorsDemo {
    int x;
    int y;

    public ConstructorsDemo(){
        x = 100; 
        y = 200;
    }
    public ConstructorsDemo(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int addNumbers(){
        return x+y;
    }

     public static void main(String[] args) {

        ConstructorsDemo c1 = new ConstructorsDemo(); 
        ConstructorsDemo c2 = new ConstructorsDemo(20,30);

        System.out.println("Explicit Constructor without Parameters Will be Called :"+c1.addNumbers());
         System.out.println("Explicit Constructor with Parameters Will be Called :"+c2.addNumbers());
        
     }

}
