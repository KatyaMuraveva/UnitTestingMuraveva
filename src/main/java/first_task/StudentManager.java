package first_task;

import java.util.HashMap;

public class StudentManager {
    private HashMap<String, Student> studentMap = new HashMap<>();

    public void addStudent(String id, Student student) {
        studentMap.put(id, student);
    }

    public Student getStudent(String id) {
        return studentMap.get(id);
    }
}

