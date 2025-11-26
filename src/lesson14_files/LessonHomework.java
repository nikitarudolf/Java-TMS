package lesson14_files;

import java.io.*;
import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\text.txt")) {
            int index;

            int maxWordLength = 0;
            String tempWord = "";
            String longestWord = "";


            while((index = fr.read()) != -1) {
                if( (index >= 65 && index <= 90 ) || (index >= 97 && index <= 122 )) {
                    tempWord += ((char) index);
                } else {
                    if(tempWord.length() >= maxWordLength ) {
                        maxWordLength = tempWord.length();
                    }
                    tempWord = "";
                }
            }
            fr.close();

            FileReader fr1 = new FileReader("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\text.txt");

            while((index = fr1.read()) != -1) {
                if( (index >= 65 && index <= 90 ) || (index >= 97 && index <= 122 )) {
                    tempWord += ((char) index);
                } else {
                    if(tempWord.length() == maxWordLength ) {
                        longestWord = longestWord.concat(tempWord + ", ");
                    }
                    tempWord = "";
                }
            }
            System.out.println(longestWord);
            FileWriter fw = new FileWriter("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\result.txt");
            fw.write("Longest words in the text:\n");
            fw.write(longestWord);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
