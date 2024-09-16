
package student;

import java.util.Date;

public abstract class Person {
    protected String id;
    protected String fullName;
    protected Date dateofBirth;

    public Person() {
    }
    

    public Person(String id, String fullName, Date dateofBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateofBirth = dateofBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    public abstract void displayInfo();
}
