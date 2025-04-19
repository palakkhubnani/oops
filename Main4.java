package javacodes;

public class Main4 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}
