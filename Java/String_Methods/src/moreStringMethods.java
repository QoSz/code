public class moreStringMethods {
    private String name = "BuckyrobsBuckyrobs";
    private String words = "Bacon";
    private String Char = "      CharredCheese        ";

    public void containz() {
        System.out.println();
        System.out.println(name.indexOf("B"));
        System.out.println(name.indexOf("B", 3));
        System.out.println(name.indexOf("rob", 11));
        System.out.println(name.contains("ucky"));
    }

    public void changeChar() {
        System.out.printf("Orignal word is %s\n", words);
        System.out.printf("Replacing the word Bacon with %s\n" ,words.replace("Ba", "Te"));
        System.out.printf("Replacing the word Bacon with %s\n" ,words.replace("B", "T"));
    }

    public void stripAndUpperCase() {
        System.out.printf("Original word is %s\n", Char);
        String strip = Char.trim();
        System.out.printf("Trimming white spaces: %s\n", strip);
        String stripToUppercase = strip.toUpperCase();
        System.out.printf("Word to upper case: %s", stripToUppercase);
    }
}
