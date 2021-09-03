public class tuna {
    String name;
    Potpie birthday;

    public tuna(String name, Potpie birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return String.format("My name is %s and my birthday is on %s", name, birthday);
    }
}
