package lesson10_object;

public class LessonHomework {
    public static void main(String[] args) {
        SystemUser admin = new SystemUser(1,"admin",true);

        SystemUser test = new SystemUser(1,"admin", true);

        SystemUser user = new SystemUser(2, "user", false);

        System.out.println(user.toString()+"\n"+admin.toString()+"\n"+test.toString());

        System.out.println("Admin equals test?: " + admin.equals(test));
        System.out.println("Admin equals user?: "+ admin.equals(user));

        System.out.println("Admin hash: " + admin.hashCode());
        System.out.println("Test hash: " + test.hashCode());
        System.out.println("User hash: " + user.hashCode());
    }
}
