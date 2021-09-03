import java.util.Objects;

public class User implements Userequals {
    private String _name = "'No Name'";
    private String _membership = "Bronze";

    // Method Overriding
    @Override
    public String toString() {
        return get_name() + " " + get_membership();
    }

    public boolean equals(User u2) {
        return Objects.equals(get_name(), u2.get_name()) && Objects.equals(get_membership(), u2.get_membership());
    }

    // Default constructor used for setting default values if nothing was passed to the method
    public User() {
    }

    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }


    // Setter
    public void set_name(String name) {
        _name = name;
    }

    // Getter
    public String get_name() {
        return _name;
    }

    // Setter
    public void set_membership(String membership) {
        _membership = membership;
    }

    // Getter
    public String get_membership() {
        return _membership;
    }

    // Method overloading set_membership()
    public void set_membership(Membership membership) {
        _membership = membership.name();
    }

    public enum Membership {
        Bronze, Silver, Gold;
    }
}
