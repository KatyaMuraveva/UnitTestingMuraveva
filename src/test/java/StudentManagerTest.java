import first_task.Student;
import first_task.StudentManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StudentManagerTest {

    @Test
    public void testAddAndGetStudent() {
        StudentManager manager = new StudentManager();
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        manager.addStudent(student1.getStudentId(), student1);
        manager.addStudent(student2.getStudentId(), student2);

        assertEquals(student1, manager.getStudent("S001"));
        assertEquals(student2, manager.getStudent("S002"));
        assertNull(manager.getStudent("S003")); // Проверка на несуществующий ID
    }
}
