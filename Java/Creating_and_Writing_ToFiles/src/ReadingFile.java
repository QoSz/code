import java.io.File;
import java.util.Scanner;

public class ReadingFile {
    private Scanner x;

    public void openFile() {
        try {
            x = new Scanner(new File("Hello.txt"));
        }
        catch (Exception e) {
            System.out.println("Could not read the file!");
        }
    }

    public void readFile() {
        while (x.hasNextLine()) {
            System.out.printf("%s\n", x.nextLine());
        }
    }

    public void closeFile() {
        x.close();
    }

}
