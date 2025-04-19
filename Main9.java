package javacodes;
import java.io.FileWriter;
import java.io.IOException;

public class Main9{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true); // true for append mode
            writer.write("\nAppending this line to the file.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}


