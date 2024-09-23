package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    String name;
    static HashMap<String,Student> students = new HashMap<String, Student>();
    String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public static void addStudent(String id, Student student){
        students.put(id,student);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public static String getStudent(String id){
        return students.get(id).name;
    }
}
