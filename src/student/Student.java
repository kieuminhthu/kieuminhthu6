
package student;

import java.util.Date;

public class Student extends Person implements IPerson{
    private float GPA;
    private String major;

    public Student() {
    }
    
    
    public Student(float GPA, String major, String id, String fullName, Date dateofBirth) {
        super(id, fullName, dateofBirth);
        this.GPA = GPA;
        this.major = major;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Date of birth: " + dateofBirth);
        System.out.println("GPA: " + GPA);
        System.out.println("Major: " + major);
    }
}
