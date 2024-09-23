package org.example;

import java.util.HashMap;
import java.util.Map;

public class SubjectGrades {
    String subject;

    static HashMap<String,Integer> grades = new HashMap<>();

    public static void addGrade(String studentName, Integer grade){
        grades.put(studentName,grade);

    }
    public static  double calculateAverage(){
        int total = 0;
        for (Integer grade : grades.values()){
            total += grade;
        }
        return (double) total / grades.size();
    }

    public String getSubject() {
        return subject;
    }
    public SubjectGrades(String subject) {
        this.subject = subject;
    }
}

