package Strings;

public class ComparisonTest {
    //using String(Immutable)
    public static void main(String[] args) {
    long startTimeString = System.currentTimeMillis();
    String str = "Java";
    for(int i=0 ; i<10000 ;i++) {
        str=(str.concat("Programming"));
    }
    long endTimeString = System.currentTimeMillis();
    System.out.println("Time Taken using Strings :"+(endTimeString-startTimeString + "ms"));

    //Using String Buffer  (Thread Safe)
    long startTimeStringBuffer = System.currentTimeMillis();
    String sbf = "Java";
    for(int i=0 ; i<10000 ; i++){
        sbf=(sbf.concat("Programming"));
    }
    long endTimeStringBuffer = System.currentTimeMillis();
    System.out.println("Time Taken for String Buffer :"+(endTimeStringBuffer-startTimeStringBuffer) +"ms");

    //Using String Builder
    long startsTimeStringBuilder = System.currentTimeMillis();
    String sbd = "Java";
    for(int i=0 ; i<10000 ; i++){
        sbd=(sbd.concat("Programming"));
    }
    long endTimeStringBuilder = System.currentTimeMillis();
    System.out.println("Time Taken for String Builder :"+(endTimeStringBuilder-startsTimeStringBuilder) +"ms");
 }
}