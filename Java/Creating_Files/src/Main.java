import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Formatter x;

        try {
            x = new Formatter("test.txt");
            System.out.println("Your file was created");
        }
        catch (Exception e) {
            System.out.printf("%s", "Was not able to create the file there was an error!");
        }
    }
}
