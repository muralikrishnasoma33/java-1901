package OOPS_Inheritance;

public class ChildSuper extends ParentSuper{
    String yourName = "Murali krishna";
    public void superMethod(){
        System.out.println("KRISHNA");
    }

    public void show(){
         superMethod();
         super.superMethod();
        
}
}
