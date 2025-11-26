package lesson13_exceptions;

public class AdditionalTask {
    public static void main(String[] args) {
        while(true) {
            try{
                System.out.println(2/0);
            } catch(RuntimeException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
            finally {
                System.out.println("Finally called ");
            }
        }

    }
}
