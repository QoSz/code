public class Static {
    private String firstName;
    private String lastName;
    private static int members = 0;

    public Static(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        members++;

        System.out.printf("Constructor for %s %s, Members in club %d\n", firstName, lastName, members);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getMembers() {
        return members;
    }
}
