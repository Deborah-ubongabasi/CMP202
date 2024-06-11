public class person{

    String name;
    private String schoolName = "Bingham university";
    private String password;
    private String matricNo;
    private int staffNo;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", password='" + password + '\'' +
                ", matricNo='" + matricNo + '\'' +
                ", staffNo='" + staffNo + '\'' +
                '}';
    }

    // Default constructor
    person() {
        System.out.println("Object created");
    }

    // Constructor for student
    public person(String name, String schoolName, String password, String matricNo) {
        this.name = name;
        this.schoolName = schoolName;
        this.password = password;
        this.matricNo = matricNo;
    }

    // Constructor for staff
    public person(String schoolName, String name, String password, int staffNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.staffNo = staffNo;
    }

    // Getter for name
    String getName() {
        return name;
    }

    // Setter for name
    void setName(String name) {
        this.name = name;
    }

    // Setter for password
    void setPassword(String password) {
        this.password = password;
    }
}




