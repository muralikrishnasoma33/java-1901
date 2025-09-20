package OOPS_Inheritance;

public class Dog extends Animal {
     public void display(){
        System.out.println("Dog Is Barking");

     }

     public void show(){
        display();
        super.display();
     }
}