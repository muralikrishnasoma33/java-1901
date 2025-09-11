package StaticAndNonStatic;

import java.util.Random;

public class Static {
    //Static Variable
    static int number;
     
    public static void main(String[] args) {
        Static s1 = new Static();
        s1.number = new Random().nextInt();// Not Recommended 

        Static.number = new Random().nextInt(); // Recommended

        Static s2 = new Static();
        s2.number = new Random().nextInt();

        System.out.println(Static.number);
        System.out.println(s2.number);
        System.out.println(s1.number);


    }


}
