package student;
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    public Student() {
        this.firstName = "Petar";
        this.lastName = "Petrovic";
        this.yearOfBirth = 1990;
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
    public void setLastName (String customLastName) {
        this.lastName= customLastName;
    }
    public int getYearOfBirth () {
        return this.yearOfBirth;
    }
    public void setYearOfBirth (int customYearOfBirth ) {
        this.yearOfBirth = customYearOfBirth ;
    }
    
    public void info() {
        System.out.println("Ime: " + getFirstName());
        System.out.println("Prezime " + getLastName());
        System.out.println("Godiste: " + getYearOfBirth());
    }
}