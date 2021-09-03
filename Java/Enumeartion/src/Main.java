import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        for (People p : People.values()) {
            System.out.printf("%s  %s  %s\n", p, p.getDesc(), p.getBirthday());
        }

        System.out.println("\n And now for the range of constants!!! \n");

        for (People s : EnumSet.range(People.Sala, People.Zara)) {
            System.out.printf("%s  %s  %s\n", s, s.getDesc(), s.getBirthday());
        }
    }
}
