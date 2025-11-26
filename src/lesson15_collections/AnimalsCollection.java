package lesson15_collections;

import java.util.ArrayDeque;

public class AnimalsCollection {
    ArrayDeque<String> animalsQueue = new ArrayDeque<>();

    public void addAnimal(String name) {
        animalsQueue.addFirst(name);
    }
    public void removeAninal() {
        animalsQueue.removeLast();
    }
}
