package NextTopic;

public class TypeCC {
     public static void main(String[] args) {
        //Type Conversion
        int num = 10; //4bytes
        double number = num; // 8bytes
        System.out.println(number);

        short m = 123;
        float n = m;
        System.out.println(n);

        //Type Casting
        double value = 13.3; //8bytes
        int newvalue = (int) value; //4bytes
        System.out.println(newvalue);

        //if conversion not possible directly
        int data = 200;
        String newdata = String.valueOf (data);
        System.out.println(newdata);

        System.out.println(data+100);
        System.out.println(newdata+200);

        //Conversion Not Possible at all
        //int j = 89;
        //boolean newj = (int) j;
    }  
}
        //Type Conversion & Type Casting

        // -> Type Conversion: 
        //    Converting from one datatype to another datatype AUTOMATICALLY 
        //    by compiler.
        //    - No data loss
        //    - Small to Big (Widening)
        //    - Handled by java compiler


        //-> Type Casting : 
        //   Converting from one datatype to another datatype MANUALLY/EXPLICITLY 
        //   - Data loss may occur.
        //   - Big to Small(Narrowing)
        //   - Handled by Developer
        //        -specify the datatype(paranthesis/data).
    

