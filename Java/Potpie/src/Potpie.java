public class Potpie {
    private int day;
    private int month;
    private int year;

    Potpie(int d, int m, int y) {
        day = d;
        month = m;
        year = y;

        System.out.printf("This constructor outputs %s\n", this);
    }

    public String toString() {
        return String.format("%d / %d / %d", day, month, year);
    }
}
