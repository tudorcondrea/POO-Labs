package lab8;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Mircea", "Cosmin", 123, 6.8));
        students.add(new Student("Popescu", "Ana-Maria", 124, 9.1));
        students.add(new Student("Munteanu", "Diana", 125, 7.3));
        students.add(new Student("Mihalache", "Florin", 126, 5.1));
        students.add(new Student("Negreanu", "Lorina", 666, 10.0));

        Collections.sort(students);

        Collections.sort(students, (student1, student2) -> Double.compare(student1.getAverageGrade(), student2.getAverageGrade()));

        PriorityQueue<Student> queue = new PriorityQueue<Student>((student1, student2) -> Long.compare(student1.getId(), student2.getId()));
        queue.addAll(students);

        HashMap<Student, LinkedList<String>> subjects = new HashMap<>();
        for (Map.Entry student : subjects.entrySet()) {
            System.out.println(student);
        }

        EvenLinkedHashSet evenSet = new EvenLinkedHashSet();
        for (int i = 1; i <= 10; i++) {
            evenSet.add(i);
        }
        for (Integer val : evenSet) {
            System.out.println(val);
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            hashSet.add(i);
        }
        for (Integer val : hashSet) {
            System.out.println(val);
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            treeSet.add(i);
        }
        for (Integer val : treeSet) {
            System.out.println(val);
        }
    }
}
