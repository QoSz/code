import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] things = {"Egg", "Milk", "Bread", "Chocolate"};
        List<String> list1 = new ArrayList<>();

        for (String x : things) {
            list1.add(x);
        }

        String[] morethings = {"Egg", "Bread"};
        List<String> list2 = new ArrayList<>();

        for (String y : morethings) {
            list2.add(y);
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s\n", list1.get(i));
        }

    }
}
