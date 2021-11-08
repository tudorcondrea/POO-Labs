package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Database {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private static int countInst = 0;

    private static Database instance = null;

    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        countInst++;
        return instance;
    }

    public static int getNumberOfInstances() {
        return countInst;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> teaList = new ArrayList<Teacher>();
        for (Teacher tea : this.teachers) {
            if (tea.getSubjects().contains(subject)) {
                teaList.add(tea);
            }
        }
        return teaList;
    }

    public List<Student> findAllStudents() {
        return this.students;
    }

    public List<Teacher> findAllTeachers() {
        return this.teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> studList = new ArrayList<Student>();
        for (Student stud : this.students) {
            if (stud.getSubjects().containsKey(subject)) {
                studList.add(stud);
            }
        }
        return studList;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> studList = new ArrayList<Student>();
        studList = this.students;
        studList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.averageGrade() > o2.averageGrade()) {
                    return 1;
                }
                else if (o1.averageGrade() < o2.averageGrade()) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        return studList;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> studList = this.getStudentsBySubject(subject);
        studList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.averageGrade() > o2.averageGrade()) {
                    return 1;
                }
                else if (o1.averageGrade() < o2.averageGrade()) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        return studList;
    }
}
