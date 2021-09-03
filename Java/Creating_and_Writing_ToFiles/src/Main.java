public class Main {
    public static void main(String[] args) {
        CWFiles file = new CWFiles();
        file.openFile();
        file.writeToFile(1, "Yash", "Shah");
        file.writeToFile(2, "Keyul", "Shah");
        file.writeToFile(3, "Bucky", "Roberts");
        file.writeToFile(4, "Cristiano", "Ronaldo");
        file.closeFile();

        ReadingFile r = new ReadingFile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
