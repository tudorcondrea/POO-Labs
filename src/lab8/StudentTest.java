package lab8;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setup() {
        student = new Student("Munteanu", "Diana", 125, 7.3);
    }

    @AfterEach
    public void clean() {
        student = null;
    }

    @Test
    @DisplayName("CompareTo test")
    public void testCompareTo() {
        Student compStudent = new Student("Munteanu", "Diana", 125, 7.3);
        Assertions.assertEquals(compStudent.compareTo(student), 0);
        Assertions.assertEquals(student.compareTo(new Student("Flavian", "Enache", 1234, 2.4)), 1);
    }
}
