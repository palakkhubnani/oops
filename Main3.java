package javacodes;
public class Main3 {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Null object can't be used!");
        }
    }
}

    