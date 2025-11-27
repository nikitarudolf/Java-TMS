package lesson14_files.serializeObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Terminal implements Serializable {
    private ArrayList<String> parameters;

    public Terminal(String[] args) {
        this.parameters = new ArrayList<>(Arrays.asList(args));
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "parameters=" + parameters.toString() +
                '}';
    }
}
