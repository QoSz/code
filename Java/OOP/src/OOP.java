import java.util.ArrayList;
import java.util.List;

public class OOP {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Yash"));
        users.add(new User("Caleb"));
        users.add(new User("Sally"));

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).get_name());
        }

    }
}
