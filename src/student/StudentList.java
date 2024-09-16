
package student;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList(){
        this.studentList = new ArrayList<>();
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void deleteStudentByID(String id){
        studentList.removeIf(student -> student.getId().equals(id));
    }
    public Student findStudentByID(String id){
        for (Student student : studentList){
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
    public Student displayAllStudent(){
        for (Student student : studentList){
            student.displayInfo();
            System.out.println("---");
        }
        return null;
    }
    public Student findTopStudent(){
        if (studentList.isEmpty())return null;
        Student topStudent = studentList.get(0);
        for (Student student : studentList){
            if (student.getGPA() > topStudent.getGPA()){
                topStudent = student;
            }
        }
        return topStudent;
    }
}
