public class Student {
    
    private String firstName;
    private String lastName;
    private int studentID;
    private double gpa;
    
    public Student(String firstName, String lastName, int id, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        studentID = id;
        this.gpa = gpa;
    }
    
    public Student(){
        firstName = "";
        lastName = "";
        studentID = 0;
        gpa = 0.0;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getID(){
        return studentID;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setID(int id){
        this.studentID = id;
    }
    
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
            
}