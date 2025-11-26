package lesson15_collections;

import java.util.*;

public class LessonHomework  {
    public static void main(String[] args) {
        deleteDuplicatesViaCollection(); // 1
        manageAnimalsCollection(); // 2
        manageStudents(); // 3


    }
    public static void manageStudents() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", "450532", 2, new double[]{5, 4, 3, 3, 4}));
        students.add(new Student("Maria", "450533", 1, new double[]{5, 2, 5, 3, 5}));
        students.add(new Student("Alex", "450534", 3, new double[]{4, 4, 1, 4, 3}));
        students.add(new Student("Anna", "450535", 2, new double[]{3, 4, 2, 3, 2}));
        students.add(new Student("Dmitry", "450536", 4, new double[]{5, 5, 4, 5, 5}));
        students.add(new Student("Elena", "450537", 1, new double[]{4, 3, 4, 4, 3}));
        students.add(new Student("Sergey", "450538", 3, new double[]{1, 1, 5, 2, 5}));
        students.add(new Student("Olga", "450539", 2, new double[]{3, 3, 3, 4, 3}));
        students.add(new Student("Pavel", "450540", 4, new double[]{4, 1, 1, 4, 4}));
        students.add(new Student("Natalia", "450541", 1, new double[]{5, 1, 1, 1, 4}));


        StudentManager manager = new StudentManager(students);
        manager.printStudents();
        manager.filterStudents();
        System.out.println("--".repeat(50));
        manager.printStudents();
        manager.printStudentsByCourse(2);
    }
    public static void manageAnimalsCollection() {
        AnimalsCollection animals = new AnimalsCollection();

        animals.addAnimal("Bear");
        animals.addAnimal("Fox");
        animals.addAnimal("Hear");
        animals.addAnimal("Rabbit");

        animals.animalsQueue.forEach(System.out::println);
        animals.removeAninal();
        System.out.println();
        animals.animalsQueue.forEach(System.out::println);
    }
    public static void deleteDuplicatesViaCollection() {
        Scanner in = new Scanner(System.in);

        Set<String> strSet = new TreeSet<>();
        String input;
        while(true) {
            System.out.println("Введите число для добавления (-1 для выхода): ");
            input = in.nextLine();
            if(Objects.equals(input, "-1"))  break;
            strSet.add(input);
        }
        strSet.forEach(System.out::println);
    }


}
