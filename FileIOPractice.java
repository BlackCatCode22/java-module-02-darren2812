// FileIOPractice.java
// dD 09/04/2025

// import Buffered Writer
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {
        // prints welcome message
        System.out.println("Hello and welcome to FileIO!");
        String fileName = "myOutputFile.txt";
        // try catch block to handle exceptions
        try {
            // Create a BufferedWriter object and use it
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            // Write the strings in three lines
            bufferedWriter.write("\nLine one");
            bufferedWriter.write("\nLine two");
            bufferedWriter.write("\nLine three");
            // closes file and outputs message
            bufferedWriter.close();
            System.out.println("Your file with title " + fileName + "has been created and modified.");
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
