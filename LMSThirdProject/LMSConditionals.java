package LMSThirdProject;

public class LMSConditionals {
    public static void main(String[] args){
        int studentGrade = 10;
        double tutionFee = 15000;
        double discount = 0;
        boolean isAcademaicTopper = true;

        //using conditionals
        if(studentGrade>=9 && studentGrade<=12){
            if(isAcademaicTopper){
            discount = 0.2;
        } else {
            discount = 0.1;
        } 
        } else if(studentGrade>=6 && studentGrade<=8){
            discount = 0.05;
        }else{
            discount = 0;
        }

        //Switch Statement
        switch(studentGrade){
        case 10:
           discount+=0.03;
           break;
        case 12:
           discount+=0.05;   
           break;
        default:
           System.out.println("No Discount");
           break;
        }   
          
        //final fee
        double discountedFee = tutionFee - tutionFee*discount;

        System.out.println("Student Grade : "+studentGrade);
        System.out.println("Actual Fee : "+tutionFee);
        System.out.println("Total Discount Percentage : "+(discount*100)+"%");
        System.out.println("Total Fee To Pay : "+discountedFee);

    }
}


