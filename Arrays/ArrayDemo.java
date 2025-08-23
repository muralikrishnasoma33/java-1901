package Arrays;

public class ArrayDemo {
    
    public static void main(String[] args) {
        //Single Dimensional Array in OLD WAY
        int [] nums = new int [3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        
        System.out.println("First Number  :"+nums[0]);
        System.out.println("Second Number :"+nums[1]);
        System.out.println("Third Number  :"+nums[2]);
        
        //Single Dimensional Array in New Way
        int[] marks = {40,50,60,70,20};

        int totalMarks = 0;
        int avgMarks = 0;
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            //total Marks
            totalMarks+=marks[i];
        }
        System.out.println("Total Marks   :"+totalMarks);

        avgMarks = totalMarks/marks.length;
        System.out.println("Average Marks :"+avgMarks);

    }
}
