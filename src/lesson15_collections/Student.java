package lesson15_collections;

import java.util.Arrays;

public class Student {
    String name;
    String group;
    int uniCourse;
    double [] marks;

    public Student(String name, String group, int uniCourse, double[] marks) {
        this.name = name;
        this.group = group;
        this.uniCourse = uniCourse;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getUniCourse() {
        return uniCourse;
    }

    public void setUniCourse(int uniCourse) {
        this.uniCourse = uniCourse;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }
    public double getAvgMark() {
        double temp = 0;
        for(double mark : marks) {
            temp += mark;
        }
        return temp / marks.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", uniCourse=" + uniCourse +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
