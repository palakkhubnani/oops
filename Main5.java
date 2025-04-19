package javacodes;
import java.io.*;

public class Main5 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

