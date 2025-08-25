
       //Write a Java program to calculate the average value of array elements.

package Arrays;
import java.util.Scanner;
public class ProblemOne {
    int [] elements;

Scanner sc = new Scanner(System.in);
   public int averageValue(){
      System.out.println("Enter Number Of Elements");
      int numberOfEle = sc.nextInt();

      int [] elements = new int[numberOfEle];
      int totalValue = 0;
      for(int i=0;i<elements.length;i++){
        System.out.println("Enter element :"+(i+1));
        elements[i] = sc.nextInt();
        totalValue = totalValue+elements[i];
      }
        int averageValue = totalValue / elements.length;
        return averageValue;
   }


     public static void main(String[] args){
          ProblemOne a1 = new ProblemOne();
          System.out.println("Average Value :"+a1.averageValue());
     }
}     