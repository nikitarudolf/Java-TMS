package lesson14_files;

import java.io.*;
import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\text.txt")) {
            int index;
            String longestWord = "";
            String tempWord = "";
            while((index = fr.read()) != -1) {
                if( (index >= 65 && index <= 90 ) || (index >= 97 && index <= 122 )) {
                    tempWord += ((char) index);
                } else {
                    if(tempWord.length() > longestWord.length() ) {
                        longestWord = tempWord;
                    }
                    tempWord = "";
                }
            }

            System.out.println(longestWord);
            FileWriter fw = new FileWriter("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\result.txt");
            fw.write(longestWord);
            fw.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
