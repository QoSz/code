public class With {

    private String[] words = {"funk", "dunk", "glunk", "furry"};

    public void startsWith() {
        for (String w : words) {
            if (w.startsWith("fu")) {
                System.out.printf("%s - begins with fu\n", w);
            }
            else {
                System.out.println(w);
            }
        }
    }

    public void endsWith() {
        System.out.println();
        for (String w : words) {
            if (w.endsWith("unk")) {
                System.out.printf("%s ends with 'unk'\n", w);
            }
            else {
                System.out.println(w);
            }
        }
    }
}
