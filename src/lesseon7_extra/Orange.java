package lesseon7_extra;

public class Orange {
    int size;
    String classification;

    private Orange(int s, String cl) {
        this.classification = cl;
        this.size = s;
    }

    public static Orange createOrange(int s, String cl) {
        Orange object = new Orange(s, cl);
        return object;
    }

}
