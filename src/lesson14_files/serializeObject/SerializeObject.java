package lesson14_files.serializeObject;

import lesson15_collections.Student;

import java.io.*;

public class SerializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Terminal Terminal = new Terminal(args);
        serializeObject(Terminal);

        Terminal TerminalNew = deSerializeObject("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\serializeObject\\serialized_object.txt");


        System.out.println(TerminalNew.toString());
    }

    public static <T> void serializeObject(T obj) throws IOException {
        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\serializeObject\\serialized_object.txt"));
        objOutput.writeObject(obj);
        objOutput.close();
    }
    public static <T> T deSerializeObject(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(fileName));
        T obj = (T) objInput.readObject();
        objInput.close();
        return obj;
    }
}
