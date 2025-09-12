package StaticAndNonStatic;

public class Blocks {
    //static block
    static{
        //configurations
        final String institute = "Edify";
        System.out.println("Static Block Content");
    }

    //Non-Static Block
    {
        System.out.println("Non-Static Block Content");
    }

    //Constructor
    public Blocks(){
          System.out.println("Constructor Execution");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Content");
        Blocks b1 = new Blocks();
    }
}
