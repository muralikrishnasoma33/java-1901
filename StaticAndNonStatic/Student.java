package StaticAndNonStatic;

public class Student{
    
    int rollNo; // Instance variable
    String name; // Instance variable
    static String college = "ABC University"; // Static variable

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", College: " + college);
    }
}


