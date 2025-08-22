package Constructors;

public class ConstructorOverloading {
    int x;
    int y;
    int z;
    float a;
    double b;

    public ConstructorOverloading(){
        x=10;
        y=30;
    }

    public ConstructorOverloading(int x,int y){
        this.x = x;
        this.y = y;
    }

    //No.of parameters Changed
    public ConstructorOverloading(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
     
    //Type of parameters changed
    public ConstructorOverloading(int x,float a){
        this.x = x;
        this.a = a;
    }

    //order of parameters changed
    public ConstructorOverloading(float a,int x,double b){
        this.a = a;
        this.x = x;
        this.b = b;
    }

    public int addNumbers1(){
       return x+y;
    }

    public int addNumbers2(){
        return x+y;
    }

    public int addNumbers3(){
        return x+y+z;
    }

    public float addNumbers4(){
        return x+a;
    }

    public double addNumbers5(){
        return a+x+b;
    }
    
    public static void main(String[] args) {

        ConstructorOverloading co1 = new ConstructorOverloading();
        System.out.println("Default Constructor          :"+co1.addNumbers1());

        ConstructorOverloading co2 = new ConstructorOverloading(3,4);
        System.out.println("Parameterized Constructor    :"+co2.addNumbers2());

        ConstructorOverloading co3 = new ConstructorOverloading(4,5,6);
        System.out.println("Number Of Parameters Changed :"+co3.addNumbers3());
     
        ConstructorOverloading co4 = new ConstructorOverloading(8,(float)5);
        System.out.println("Type Of Parameters Changed   :"+co4.addNumbers4());
        System.out.println("a value :"+co4.a);

        ConstructorOverloading co5 = new ConstructorOverloading(8,(int)4,(double)8);
        System.out.println("Order Of Parameters Changed  :"+co5.addNumbers5());
    }

}
