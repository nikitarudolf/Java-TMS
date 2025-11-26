package lesson14_files.documentValidation;

import lesson13_exceptions.Verificator;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) throws IOException {
        String filePath;

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Введите путь к файлу с документами");
            filePath = in.nextLine();

            try (FileReader docReader = new FileReader(filePath)) {
                int index;
                String docName = "";
                while ((index = docReader.read()) != -1) { // в конце файла надо оставлять пустую строку

                    if(index != 13) {
                        docName = docName.concat(String.valueOf((char)index));

                    } else {

                        System.out.println(DocumentNameVerificator.verifyDocument(docName));
                        docReader.read();
                        docName = "";
                    }
                }
                DocumentNameVerificator.closeStream();
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }



    }
}
