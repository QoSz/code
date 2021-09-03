import java.io.*;
import java.lang.*;
import java.util.*;

public class CWFiles {
    private Formatter x;

    public void openFile() {
        try {
            x = new Formatter("Hello.txt");
            System.out.println("The file was created");
        }
        catch (Exception e) {
            System.out.println("File not created there were errors!");
        }
    }

    public void writeToFile(int ID, String firstName, String lastName) {
        x.format("%d %s %s\n", ID, firstName, lastName);
    }

    public void closeFile() {
        x.close();
    }
}
