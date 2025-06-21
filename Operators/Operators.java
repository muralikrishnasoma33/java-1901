package Operators;

public class Operators {

    public static void main(String[] args)
    {   
        int num1 = 5;
        int num2 = 20;

        //Addition
        System.out.println("Addition : "+(num1+num2));

        //Subtraction
        System.out.println("Subtraction : "+(num1-num2));

        //Multiplication
        System.out.println("Multiplication : "+(num1*num2));
        
        //Division
        System.out.println("Division : "+(num1/num2));

        //Modulus
        System.out.println("Modulus : "+(num1%num2));

        //increment & Decrement
        //Increment(++)
        int h = 8;
        int q = ++h + h++;
        System.out.println("Value of : "+q);
        System.out.println("Value of : "+h);

        //Decrement(--)
        int num3 = 7;
        int num4 = --num3;
        System.out.println("Value of Num4 : "+num4);

        //Assignment operator (+=,-=,*=,/=,==)
        int data = 89;
        int newdata = 90;
        //int value = newdata += data;
        //System.out.println("Addition Assignment : "+value);
        // Multiplication Assignment(*=)
        //System.out.println("Multiply Assignment : "+(data*=newdata));
        // Subtraction (-=)
        //System.out.println("Subtraction Assignment : "+(data-=newdata));
        System.out.println("Subtraction Assignment : "+(newdata-=data));

        System.out.println(data);
        System.out.println(newdata);

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
        //Logical Operators(&& , || , !)
        //AND operator(&&)
        boolean and = num1<num2 && num1>num2;
        System.out.println("AND operator               : "+and);

        boolean or = num1<num2 || num1>num2;
        System.out.println("OR operator                : "+or);

        boolean not = num1<num2 || num1>num2;
        System.out.println("NOT operator               : "+not);
    }

}
