package lesseon7_extra;

import static lesseon7_extra.Orange.createOrange;

public class CreateClassUsingPrivateConstructor {
    public static void main(String[] args) {
        Orange orange = createOrange(5, "Tasty");
        System.out.println(orange.classification);
    }
}
