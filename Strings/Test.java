package Strings;

public class Test {
    public static void main(String[] args) {
        String s1 = "Murali";
        String s2 = "Murali";

        String s3 = new String("Murali");
        String s4 = new String("Murali");   

        System.out.println(s1==s2);  //true (Content is Same and used String literals that's why we got true)
        System.out.println(s1==s3);  //false(Content is same but differ in using literals and new keyword,that's why we got false)

        System.out.println(s2==s4);  //false
        System.out.println(s3==s4);  //false(Here Content is same and used new keywords although we got false,because when we use new keyword there will be a new memory block existed.)
       
        System.out.println(s1.equals(s3)); //true (we are comparing values by using equals())
    
    }
    

}
