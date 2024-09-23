package org.example;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kim", "001");
    Student student2 = new Student("Sunset", "002");

    Student.addStudent(student1.getStudentId(), student1);
    Student.addStudent(student2.getStudentId(), student2 );

        System.out.println(Student.getStudent("002"));



        SubjectGrades.addGrade("Kim", 5);
        SubjectGrades.addGrade("Anna", 4);
        SubjectGrades.addGrade("Nikita", 3);
        SubjectGrades.addGrade("Sofa", 4);

        SubjectGrades grades = new SubjectGrades("Math");
        double average = SubjectGrades.calculateAverage();

        System.out.println("Среднее оценок в " + grades.getSubject() + " " + average);

        AddressBook book = new AddressBook();

        AddressBook.addContact("Irina", "952-76-09");
        AddressBook.addContact("Eva", "921-82-74");
        AddressBook.addContact("NIka", "981-35-89");

        System.out.println(book.getPhone("Irina"));
        book.removeContact("Nika");

        


    }
}