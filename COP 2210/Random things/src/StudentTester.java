public class StudentTester {

    public static void main(String[] args) {
        
        Student a = new Student("Pedro", "Perez", 5163353, 4.0);
        Student b = new Student();
        
        System.out.println("First name: " + a.getFirstName() + 
                "\nLast Name : " + a.getLastName() + 
                "\nStudent ID: " + a.getID() + 
                "\nGPA: " + a.getGPA());
        
        System.out.println("==================================\nFirst name: " + b.getFirstName() + 
                "\nLast Name : " + b.getLastName() + 
                "\nStudent ID: " + b.getID() + 
                "\nGPA: " + b.getGPA());
        
    }
    
}