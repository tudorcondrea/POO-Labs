package lab8;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name, surname;
    private long id;
    private double averageGrade;

    public Student() {

    }

    public Student(String name, String surname, long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student student) {
        if (Double.compare(this.averageGrade, student.averageGrade) != 0) {
            return Double.compare(this.averageGrade, student.averageGrade);
        }
        else {
            if (this.name.compareTo(student.name) != 0) {
                return this.name.compareTo(student.name);
            }
            else {
                return this.surname.compareTo(student.surname);
            }
        }
    }

    @Override
    public String toString() {
        return "Nume: " + this.name + "\n"
                + "Prenume: " + this.surname + "\n"
                + "Medie: " + this.averageGrade + "\n"
                + "ID: " + this.id + "\n";
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.averageGrade, averageGrade) == 0 && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }
}
