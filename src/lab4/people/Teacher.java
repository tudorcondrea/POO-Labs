package lab4.people;

import lab4.database.Database;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<String> subjects;

    public Teacher(String firstName, String lastName, List<String> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public Teacher(Teacher tea) {
        this.firstName = tea.firstName;
        this.lastName = tea.lastName;
        this.subjects = tea.subjects;
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Teacher> getAllTeachers() {
        Database db = Database.getInstance();
        List<Teacher> teaList = new ArrayList<Teacher>();
        teaList = db.findAllTeachers();
        return teaList;
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        Database db = Database.getInstance();
        List<Teacher> teaList = new ArrayList<Teacher>();
        teaList = db.findTeachersBySubject(subject);
        return teaList;
    }

    public List<Student> getAllStudents() {
        Database db = Database.getInstance();
        List<Student> studList = new ArrayList<Student>();
        studList = db.findAllStudents();
        return studList;
    }

    public List<Student> getStudentsBySubject(String subject) {
        Database db = Database.getInstance();
        List<Student> studList = new ArrayList<Student>();
        studList = db.getStudentsBySubject(subject);
        return studList;
    }

    public List<Student> getStudentsByAverageGrade() {
        Database db = Database.getInstance();
        List<Student> studList = new ArrayList<Student>();
        studList = db.getStudentsByAverageGrade();
        return studList;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        Database db = Database.getInstance();
        List<Student> studList = new ArrayList<Student>();
        studList = db.getStudentsByGradeForSubject(subject);
        return studList;
    }
}
