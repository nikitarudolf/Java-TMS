package lesson15_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public void filterStudents() {
        for(int index = 0; index < students.size(); index++) {
            if(students.get(index).getAvgMark() < 3) {
                students.remove(students.get(index));
            } else {
                students.get(index).uniCourse++;
            }
        }
    }

    public void printStudentsByCourse(int course) {
        System.out.println("Студенты "+course+"-го курса: ");
        for(Student student : students) {
            if(student.getUniCourse() == course) {
                System.out.println(student.name);
            }
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for(Student s : students) {
            System.out.println(s.toString());
        }
    }
}
