package student;

import course.Course;
import computer.Computer;


public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer myComputer;
    
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
        this.course = new Course();
        this.myComputer = new Computer();
    }
    
    public Student (String customFirstName, String customLastName, int customYearOfBirth ){
        this.firstName= customFirstName;
        this.lastName=customLastName;
        this.yearOfBirth=customYearOfBirth;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName (String customFirstName) {
        this.firstName= customFirstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public Course getCourse() {
        return this.course;
    }
    
    public Computer getMyComputer() {
        return this.myComputer;
    }
    
    
    public void setLastName (String customLastName) {
        this.lastName = customLastName;
    }
    
    public int getYearOfBirth () {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth (int customYearOfBirth ) {
        this.yearOfBirth = customYearOfBirth ;
    }
    
    public void setCourse(Course c) {
        this.course = c;
    }
   
    public void setMyComputer(Computer comp) {
        this.myComputer = comp;
    }
    
    
    public void info() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name " + getLastName());
        System.out.println("Year of Birth: " + getYearOfBirth());
        System.out.println("Course Name: " + getCourse().getName());
        System.out.println("Course Number of Clasess: " + getCourse().getNumberOfClasses());
        System.out.println("Computer Process Tact: " + getMyComputer().getProcessTact());
        System.out.println("Computer Memory: " + getMyComputer().getMemory());
        System.out.println("Computer Hard Drive: " + getMyComputer().getHardDrive());
    }
}