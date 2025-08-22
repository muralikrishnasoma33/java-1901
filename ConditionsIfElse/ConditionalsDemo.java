package ConditionsIfElse;

public class ConditionalsDemo {
    public static void main(String[] args) {
        System.out.println("============Conditional statements============");
        System.err.println("\n");
        System.out.println("----------IF Statement----------");
        //if statement
        //Checking the number is positive.
        int num = 50;
        if(num<=50){
            System.out.println("The Given number is positive");
        }
        
        System.err.println("----------If ELSE Statement----------");
        //if else Statement
        //Checking whether the number is positive or negative
        int j = -10;
        if(j>=10){
            System.out.println("The given number is Positive");
        }else{
            System.out.println("The given number is Negative");
        }
        System.out.println("-----TASK-----");
        //Task for the checking of the number is in the range of 10-20
        int k = 20;
        if(k>=10 && k>=20){
            System.out.println("The Given number is in the range of 10-20");
        }else{
            System.out.println("The Given number is not in the range of 10-20");
        }
        
        System.err.println("----------Ternary Operator----------");
        //Ternary Operator
        int age = 20;
        String voteEligibility = (age>=20) ? "You Can Vote":"You cannot Vote";
        System.out.println(voteEligibility);
        
        System.err.println("----------NESTED ELSE IF Statement----------");
        //Nestewd Else If(Else if ladder)
        int marks = 70;
        if(marks>=80){
            System.out.println("Grade A");
        }else if(marks>=60){
            System.out.println("Grade B");
        }else if(marks>=40){
            System.out.println("Grade C");
        }else{
            System.out.println("Failed");
        }
        System.out.println("----------switch Statement----------");
        //Switch Statement
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;   
            case 6:
                System.out.println("saturady");
                break;
            case 7:
                System.out.println("Sunday");
                break;               
            default:
                System.out.println("ERROR");
                break;
        }

        //fall through use case
        int days = 2;
        switch (days) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
              System.out.println("Weekdays");
              break;
            case 6:
            case 7:
              System.err.println("Weekends"); 
              break;
            default:{
            System.out.println("Invalid");
            }   
        }
      

        //New Switch Case
        int newday = 4;
        String dayName = switch(newday){
            case 1,2,3,4,5 -> "Holiday";
            case 6,7 -> "Not Holiday";
            default -> "Nothing";
        };
        System.out.println(dayName);

    }
    
}
