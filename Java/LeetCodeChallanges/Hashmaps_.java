import java.util.HashMap;

public class Hashmaps_ {

    public static void main(String[] argc) {
        HashMap<String, Integer> details = new HashMap<String, Integer>();

        details.put("Yash Shah", 19);
        details.put("Keyul Shah", 23);
        details.put("Jeff Bazoz", 50);

        System.out.println(details);

        System.out.println(details.get("Yash Shah"));

        System.out.println(details.isEmpty());

        details.replace("Yash Shah", 19, 17);

        System.out.println(details);

        System.out.println(details.size());

        details.clear();

        System.out.println(details);

    }

}
