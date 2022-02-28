package lab4.people;

import lab4.database.Database;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public Student(Student st) {
        this.firstName = st.firstName;
        this.lastName = st.lastName;
        this.subjects = st.subjects;
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

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        double total = 0, count = 0;
        for (String key : this.subjects.keySet()) {
            total += this.subjects.get(key);
            count++;
        }
        return total / count;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teaList = new ArrayList<Teacher>();
        Database db = Database.getInstance();
        teaList = db.findAllTeachers();
        return teaList;
    }

    public int getGradeForSubject(String subject) {
        return this.subjects.get(subject);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        List<Teacher> teaList = new ArrayList<Teacher>();
        Database db = Database.getInstance();
        teaList = db.findTeachersBySubject(subject);
        return teaList;
    }

    public List<Student> getAllStudents() {
        List<Student> studList = new ArrayList<Student>();
        Database db = Database.getInstance();
        studList = db.findAllStudents();
        return studList;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> studList = new ArrayList<Student>();
        Database db = Database.getInstance();
        studList = db.getStudentsBySubject(subject);
        return studList;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> studList = new ArrayList<Student>();
        Database db = Database.getInstance();
        studList = db.getStudentsByAverageGrade();
        return studList;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> studList = new ArrayList<Student>();
        Database db = Database.getInstance();
        studList = db.getStudentsByGradeForSubject(subject);
        return studList;
    }
}
