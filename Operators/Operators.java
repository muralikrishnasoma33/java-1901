package Operators;

import java.lang.foreign.SymbolLookup;

public class Operators {

    public static void main(String[] args)
    {   
        System.out.println("----------------OPERATORS----------------");
        System.err.println("\n");
        int num1 = 5;
        int num2 = 20;

        //Addition
        System.out.println("Addition                      : "+(num1+num2));

        //Subtraction
        System.out.println("Subtraction                   : "+(num1-num2));

        //Multiplication
        System.out.println("Multiplication                : "+(num1*num2));
        
        //Division
        System.out.println("Division                      : "+(num1/num2));

        //Modulus
        System.out.println("Modulus                       : "+(num1%num2));
        System.out.println("\n");
        System.out.println("----------INCREMENT AND DECREMENT----------");
        //increment & Decrement
        //Increment(++)
        int h = 8;
        int q = ++h + h++;
        System.out.println("Value of                     : "+q);
        System.out.println("Value of                     : "+h);

        //Decrement(--)
        int num3 = 7;
        int num4 = --num3;
        System.out.println("Value of Num4                : "+num4);
        System.out.println("\n");
        System.out.println("----------Assignment Operators----------"); 
        //Assignment operator (+=,-=,*=,/=,==)
        int data = 89;
        int newdata = 90;
        //int value = newdata += data;
        //System.out.println("Addition Assignment : "+value);
        // Multiplication Assignment(*=)
        //System.out.println("Multiply Assignment : "+(data*=newdata));
        // Subtraction (-=)
        //System.out.println("Subtraction Assignment : "+(data-=newdata));
        System.out.println("Subtraction Assignment      : "+(newdata-=data));

        System.out.println(data);
        System.out.println(newdata);
        System.out.println("\n");
        System.out.println("----------Comparison Operators----------");
        //Comparison Operator (< , <= , > , >=, ==, !=)
        boolean isGreater = num1>num2;
        System.out.println("Greater Than                : "+isGreater);

        boolean isGreaterthanOrEqualsto = num1>=num2;
        System.out.println("Greater than or Equals To   : "+isGreaterthanOrEqualsto);

        boolean isLessthan = num1<num2;
        System.out.println("Less Than                   : "+isLessthan);

        boolean islessthanorequalsto = num1<=num2;
        System.out.println("Less Than or Equals To      : "+islessthanorequalsto);

        boolean isequalsTo = num1==num2;
        System.out.println("Equals To                   : "+isequalsTo);

        boolean isNotEqualsTo = num1!=num2;
        System.out.println("Not Equals To               : " +isNotEqualsTo);
        System.out.println("\n");
        System.out.println("----------Logical Operators----------");
        //Logical Operators(&& , || , !)
        //AND operator(&&)
        boolean and = num1<num2 && num1>num2;
        System.out.println("AND operator                : " +and);

        boolean or = num1<num2 || num1>num2;
        System.out.println("OR operator                 : " +or);

        boolean not = num1<num2 || num1>num2;
        System.out.println("NOT operator                : " +not);
        System.out.println("\n");
        System.out.println("-----------Bitwise Operators----------");
        //Bitwise Operators (<< , >> , &(AND) , |(OR) , ^(XOR) , ~(NOT))
        //& (AND)
        int a1 = 8; //1000
        int a2 = 7; //0111
        System.out.println("AND                          : " +(a1&a2)); // Sets each bit to 1 if both bits are 1

        // | (OR)
        int b1 = 5; //0101
        int b2 = 2; //0010
        System.out.println("OR                           : " +(b1|b2)); // Sets each bit to 1 if one of the bits 1

        // ^ (XOR)
        int c1 = 3;  //0011
        int c2 = 8;  //1000
        System.out.println("XOR                          : " +(c1^c2)); // Sets each bit 1 if only one of the bits 1

        // ~ (NOT)
        int d1 = 0; //0000
        System.out.println("NOT                          : " +(~d1)); //Reverse the Bits

        // <<(LEFT SHIFT) -> Add those many zeros filling left side
        // 6      -> 0000000000000110
        // 3<<2   -> 0000000000011000
        System.out.println("Left Shift                   : " +(3<<2));

        // >>(RIGHT SHIFT) -> Shifts the bits to right side,preserving the bits 
        // ex: 0000000000000011 in right shift(>>2) 000000000000000(11) last two will fall off and it will be 0000000000000000
        // 5      -> 0000000000000101
        // 5>>2   -> 0000000000000001
        System.out.println("Right Shift                  : " +(5>>2));
    }

}
