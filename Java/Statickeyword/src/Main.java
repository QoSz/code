public class Main {
    public static void main(String[] args) {
        Static m1 = new Static("Taylor", "Alesia");
        Static m2 = new Static("Dua", "Lipa");
        Static m3 = new Static("Ester", "Expolito");


        System.out.printf("%s \n%s \n%d", m1.getFirstName(), m1.getLastName(), Static.getMembers());

    }
}