
package student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws ParseException {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        while (true){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 -> {
                    System.out.println("ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Full name: ");
                    String fullname = scanner.nextLine();
                    System.out.println("Date of birth: ");
                    String dateofbirth = scanner.nextLine();
                    Date dateOfBirth = dateFormat.parse(dateofbirth);
                    System.out.println("GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Major: ");
                    String major = scanner.nextLine();
                    studentList.addStudent(new Student(gpa, major, id, fullname, dateOfBirth));
                }
                case 2 -> {
                    System.out.print("ID to update: ");
                    String updateid = scanner.nextLine();
                    Student studentToUpdate = studentList.findStudentByID(updateid);
                    if (studentToUpdate != null) {
                        System.out.print("Full name: ");
                        studentToUpdate.setFullName(scanner.nextLine());
                        System.out.print("Date of birth : ");
                        String newDob = scanner.nextLine();
                        studentToUpdate.setDateofBirth(dateFormat.parse(newDob));
                        System.out.print("GPA: ");
                        studentToUpdate.setGPA(scanner.nextFloat());
                        scanner.nextLine();
                        System.out.print("Major: ");
                        studentToUpdate.setMajor(scanner.nextLine());
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 3 -> {
                    System.out.print("ID to delete: ");
                    String deleteid = scanner.nextLine();
                    studentList.deleteStudentByID(deleteid);
                }
                case 4 -> studentList.displayAllStudent();
                case 5 -> {
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null){
                        System.out.println("Top student: ");
                        topStudent.displayInfo();
                    }else{
                        System.out.println("No student in the list");
                    }
                }
                case 6 -> { 
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Please try again");
            }
        }
    }
}
