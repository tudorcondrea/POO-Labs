package lab1.task2;

public class Course {
    private String title;
    private String description;
    private Student[] students;

    public Student[] filterYear( Integer yearCheck ) {
        Student[] retStudents = new Student[30];
        int count = 0;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getYear() == yearCheck)
            {
                retStudents[count] = this.students[i];
                count++;
            }
        }
        return retStudents;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
