public class Main {
    public static void main(String[] args) {
        MilitaryTime T = new MilitaryTime();
        MilitaryTime T2 = new MilitaryTime(15);
        MilitaryTime T3 = new MilitaryTime(15, 32);
        MilitaryTime T4 = new MilitaryTime(15, 32, 47);

        System.out.printf("%s\n", T.toMilitaryTime());
        System.out.printf("%s\n", T2.toMilitaryTime());
        System.out.printf("%s\n", T3.toMilitaryTime());
        System.out.printf("%s\n", T4.toMilitaryTime());
    }
}
