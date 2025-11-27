package lesson15_collections.myArrayList;
import java.util.Scanner;



public class AdditionalTask {
    public static void main(String[] args) {
        listMenu(chooseList());
    }

    public static void clearConsole() {
        System.out.println("\n".repeat(40));
    }
    public static MyArrayList chooseList() {
        while(true) {
            System.out.println("1) Work with Integer");
            System.out.println("2) Work with Double");
            System.out.println("3) Work with String");
            switch (new Scanner(System.in).nextLine()) {
                case "1" : return new MyArrayList<Integer>();
                case "2" : return new MyArrayList<Integer>();
                case "3" : return new MyArrayList<Integer>();
                default:
                    System.out.println("Wrong choice ");
            }
        }
    }

    public static <T> void listMenu(MyArrayList<T> list) {
        int exitFlag = 0;
        String inputChoice;
        Scanner in = new Scanner(System.in);

        while(exitFlag != 1) {
            System.out.println("1) Add element to List");
            System.out.println("2) Check if list contains element");
            System.out.println("3) Remove element from List");
            System.out.println("4) Print list");
            System.out.println("5) Clear list");
            System.out.println("0) Exit");

            inputChoice = in.nextLine();
            clearConsole();


            switch (inputChoice) {
                case "1":
                    System.out.println("Input data: ");
                    list.add((T)in.nextLine());
                    System.out.println("Element added");
                    break;
                case "2":
                    System.out.println("Input data: ");
                    System.out.println(list.contains((T)in.nextLine()));
                    break;
                case "3":
                    System.out.println("Input index to remove: ");
                    list.remove(in.nextInt());
                    in.nextLine();
                    System.out.println("Element removed");
                    break;
                case "4":
                    System.out.println("Elements of list: ");
                    list.print();
                    break;
                case "5":
                    list.clear();
                    System.out.println("List cleared");
                    break;
                case "0": exitFlag = 1; break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }

}
