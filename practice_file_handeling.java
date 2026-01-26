import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.annotation.processing.FilerException;

public class practice_file_handeling {
    public static void main(String[] args) {
        // create a new file
        // try {
        // File myFile = new File("example.txt");

        // if (myFile.createNewFile()) {
        // System.out.println("File created: " + myFile.getName());
        // } else {
        // System.out.println("File already exists.");
        // }
        // } catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        // write to a file

        // try {
        // FileWriter writer = new FileWriter("example2.txt");
        // writer.write("Hello, this is a sample text written to the file.");
        // writer.close();
        // System.out.println("Successfully wrote to the file.");
        // } catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        // writing using try with resources

        // try (FileWriter filenew = new FileWriter("this.txt", false)) {
        // filenew.write(" 2nd new file text");
        // System.out.println("Successfully wrote to the file.");
        // } catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        // reading file/
        // File file = new File("this.txt");

        // try (Scanner new1 = new Scanner(file)) {
        // while (new1.hasNextLine()) {
        // String data = new1.nextLine();
        // System.out.println(data);
        // }
        // } catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        // File file = new File("this.txt");
        // if (file.exists()) {
        // System.out.println("The file exists.");
        // System.out.println("File name: " + file.getName());
        // System.out.println("Absolute path: " + file.getAbsolutePath());
        // System.out.println("Writeable: " + file.canWrite());
        // System.out.println("Readable: " + file.canRead());
        // System.out.println("File size in bytes: " + file.length());

        // } else {
        // System.out.println("The file does not exist.");
        // }

        // File file = new File("this.txt");
        // if (file.delete()) {
        // System.out.println("Deleted the file: " + file.getName());
        // } else {
        // System.out.println("Failed to delete the file.");
        // }

        // fileinputstream example

        // try (FileInputStream fileinput = new FileInputStream("example.txt")) {
        // int i;
        // while ((i = fileinput.read()) != -1) {
        // System.out.print((char) i);
        // }
        // } catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        // try (FileInputStream input = new FileInputStream("example.txt")) {
        // int i;
        // while ((i = input.read()) != -1) {
        // System.out.print((char) i);
        // }
        // } catch (IOException e) {
        // System.out.println("Error reading file.");
        // }

        // try (FileInputStream input = new FileInputStream("img.jfif");
        // FileOutputStream output = new FileOutputStream("img_copy.jpg")) {
        // int i;
        // while ((i = input.read()) != -1) {
        // output.write(i);
        // }
        // System.out.println("File copied successfully.");
        // } catch (IOException e) {
        // System.out.println("Error during file copy.");
        // }

        // output stream example
        // String text = "hi his is me";

        // try (FileOutputStream output = new
        // FileOutputStream("newOUtputfileUsingStream.txt")) {
        // output.write(text.getBytes());
        // System.out.println("Successfully written to the file using OutputStream.");
        // } catch (IOException e) {
        // System.out.println("Error writing to file.");
        // }

        // try (FileInputStream input = new FileInputStream("img.jfif");
        // FileOutputStream output = new FileOutputStream("copy.jpg")) {
        // int b;
        // while ((b = input.read()) != -1) {
        // output.write(b);

        // }
        // System.out.println("Image copied successfully.");
        // } catch (IOException e) {
        // System.out.println("Error during image copy.");
        // }

        // String text = "This is some text to be written to the file using
        // FileOutputStream.";

        // try (FileOutputStream output = new FileOutputStream("Filename.txt", true)) {
        // output.write(text.getBytes());
        // System.out.println("Successfully appended to the file using
        // FileOutputStream.");
        // } catch (IOException e) {
        // System.out.println("Error appending to file.");
        // }

        try (BufferedReader reader = new BufferedReader(new FileReader("Filename.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file using BufferedReader.");
        }
    }
}