public class OOP {
    public static void main(String[] args) {
        User u = new User("Yash", "Bronze");
        u.set_membership(User.Membership.Silver); // Using enums
        User u2 = new User();
        User u3 = new User("Yash", "Bronze");
        u3.set_membership(User.Membership.Silver); // Using enums

        System.out.println(u.get_membership());
        System.out.println(u2.get_membership());

        // Running System.out.println(u); without method overriding would print the memory location
        System.out.println(u);
        System.out.println(u2);

        // Comparing u and u3 with == would print "false" as it is comparing the memory
        // locations instead of the values.
        // therefore, using method overloading we can compare the values instead.
        System.out.println(u.equals(u3));
    }
}
