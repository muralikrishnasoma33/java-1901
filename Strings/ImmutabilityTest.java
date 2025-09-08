package Strings;

public class ImmutabilityTest {
    public static void main(String[] args) {
        //Immutability test
        String str = "Hello";
        System.out.println(str.concat("World"));
        System.out.println(str);

        String s = "hello";
        s = s.concat("world");   // On Every Change new Object is Created
        s = s.concat("java");    // new Object is Created.
        s = s.concat("program"); //new Object is Created.
        System.out.println(s);

        //String Buffer
        StringBuffer sbf = new StringBuffer("Welcome");  //New Object is Created
        sbf.append(" To Java");   //Same obj is updated
        sbf.append(" Course");    //Same obj is updated
        sbf.append(" All The Best"); //Same obj is updated
        System.out.println(sbf);

        //String Builder
        StringBuilder sbd = new StringBuilder("Welcome");  //New Object is Created
        sbd.append(" To Java");  //Same obj is updated
        sbd.append(" Course");   //Same obj is upadated
        sbd.append(" All The Best");  //Same obj is updated
        System.out.println(sbd);
    }
}
