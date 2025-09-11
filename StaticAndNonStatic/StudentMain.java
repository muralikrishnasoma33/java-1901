package StaticAndNonStatic;

public class StudentMain {
    
    public static void main(String args[]) {
        // Create student objects
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");

        // Display initial details
        s1.display();
        s2.display();

        // Change the static variable (college)
        // This change will be reflected in all objects
        Student.college = "XYZ College"; 

        // Display details after changing the static variable
        s1.display();
        s2.display();
    }
}



