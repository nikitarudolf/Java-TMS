package lesson10_object;

import java.util.Scanner;

public class HomeworkAdditional {
    public static void main(String[] args) throws CloneNotSupportedException {

        SystemUserCloneable[] users = new SystemUserCloneable[] {
                new  SystemUserCloneable(1, "Dmitry", false, new Car("Volkswagen", 2007)),
                new SystemUserCloneable(2, "Egor", false, new Car("Renault", 2011)),
                new SystemUserCloneable(3, "Pavel", true, new Car("Audi", 2001)),
                new SystemUserCloneable(4, "Nikita", false, new Car("Nissan", 2019)),
                new SystemUserCloneable(5, "Darya", false, new Car("Bmw", 2020)),
        };

        users[0].header();
        for(SystemUserCloneable user : users) {
            user.output();
        }

        System.out.println("Choose user id to clone");

        int idToClone = new Scanner(System.in).nextInt();
        SystemUserCloneable clone = new SystemUserCloneable();
        System.out.println("Choose method\n1)Shallow (Notify that changing clone car parameters will cause changing in original!!!)\n2)Deep\n");
        switch (new Scanner(System.in).nextInt()) {
            case 1 :
            {
                clone = users[idToClone-1].cloneShallow();
                break;
            }
            case 2 :
            {
                clone = users[idToClone-1].clone();
                break;
            }

        }
        System.out.println("You cloned user with id " + users[idToClone-1].getId() + " using chosen method");
        clone.header();
        clone.output();
        System.out.println();
        for(SystemUserCloneable user : users) {
            user.output();
        }
        System.out.println("--".repeat(50));
        System.out.println("Changing car of original user");
        System.out.println("--".repeat(50));
        System.out.println(users[idToClone-1].getCar().getManufacturer() + " --> " + "Ferrari" );
        System.out.println(users[idToClone-1].getCar().getYearOfProduction() + " --> " + "2026" );
        System.out.println("--".repeat(50));
        users[idToClone-1].getCar().setManufacturer("Ferrari");
        users[idToClone-1].getCar().setYearOfProduction(2026);
        System.out.println("Clone: ");
        clone.header();
        clone.output();
        System.out.println("--".repeat(50));
        System.out.println("Original: ");
        clone.header();
        users[idToClone-1].output();


    }
}
