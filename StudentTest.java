package CoreJaveTest;

import OopsConcepts.Student;

public class StudentTest {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
 
        try {
 
            Student student = manager.find("123456");
            System.out.println("correct");
 
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
        
    }
}
