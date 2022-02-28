package lab1.task2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("poo");
        course.setDescription("programare orientata pe obiecte");
        Student[] students = new Student[4];
        for (int i = 0; i < 4; i++)
            students[i] = new Student();
        students[0].setName("Ionescu Gigel");
        students[0].setYear(2);
        students[1].setName("Silviu Constantin");
        students[1].setYear(3);
        students[2].setName("Popescu Delia");
        students[2].setYear(1);
        students[3].setName("Oprea Ovidiu");
        students[3].setYear(2);
        course.setStudents(students);

        Student[] yearStudents = new Student[20];
        yearStudents = course.filterYear(Integer.parseInt(args[0]));
        for (int i = 0; i < yearStudents.length && yearStudents[i] != null; i++) {
            System.out.println(yearStudents[i].getName());
        }

        Student obj1 = new Student(), obj2 = new Student();
        obj1.setName("Ana Maria");
        obj1.setYear(3);
        obj2.setName("Ana Maria");
        obj2.setYear(3);
        if (obj1.equals(obj2))
            System.out.println("They are the same!");
        else
            System.out.println("They are not the same!");
    }
}
