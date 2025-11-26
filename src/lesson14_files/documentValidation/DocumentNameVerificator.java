package lesson14_files.documentValidation;

import java.io.FileWriter;
import java.io.IOException;

public class DocumentNameVerificator {
    static FileWriter validDocWriter;

    static {
        try {
            validDocWriter = new FileWriter("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\documentValidation\\validDocs.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static FileWriter invalidDocWriter;

    static {
        try {
            invalidDocWriter = new FileWriter("C:\\Users\\nikit\\IdeaProjects\\01102025\\src\\lesson14_files\\documentValidation\\invalidDocs.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeStream() throws IOException {
        validDocWriter.close();
        invalidDocWriter.close();
    }
    public static boolean verifyDocument(String docName) throws IOException {


        if(!docName.startsWith("docnum") && !docName.startsWith("contract")) {
            invalidDocWriter.write(docName + " [Doc name must start with \"docnum\" or \"contract\" keyword]\n");
            return false;
        }

        for(char c : docName.toCharArray()) {
            if ( !(48 <= c && c <= 57) && !( (c >= 65 && c <= 90 ) || (c >= 97 && c <= 122 ) ) && c != '\r' ){
                invalidDocWriter.write(docName + " [Doc name must contain only letters or digits]\n");
                return false;
            }

        }

        if(docName.length() != 15) {
            invalidDocWriter.write(docName + " [Doc length must be 15 characters]\n");
            return false;
        }
        validDocWriter.write(docName+"\n");
        return true;
    }
}
