import java.io.File;

public class Main {
    public static void main(String[] args) {
        File x = new File("/bin/aa-notify");

        if (x.exists()) {
            System.out.println("File does exist " + x.getName());
        } else {
            System.out.println("Doesn't exist");
        }
    }
}
