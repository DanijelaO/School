package course;

public class Course {

    private String name;
    private int numberOfClasses;
    private String codeName;
    
    
    public Course() {
        this.name = "";
        this.numberOfClasses = 0;
        this.codeName = "";
    }
    public Course (String customName, int customnumberOfClasses, String customCodeName ){
        this.name= customName;
        this.numberOfClasses=customnumberOfClasses;
        this.codeName=customCodeName;
}
    public String getname() {
        return this.name;
    }
    public void setName (String customName) {
        this.name= customName;
    }
     public int getnumberOfClasses() {
        return this.numberOfClasses;
    }
    public void setnumberOfClasses (int customnumberOfClasses) {
        this.numberOfClasses= customnumberOfClasses;
    }
    public String getcodeName () {
        return this.codeName;
    }
    public void setcodeName (String customcodeName ) {
        this.codeName = customcodeName;
    }
    
    public void info() {
        System.out.println("Name: " + getname());
        System.out.println("Number of Classes " + getnumberOfClasses());
        System.out.println("CodeName: " + getcodeName());
    }
}

