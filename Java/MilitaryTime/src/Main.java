public class Main {
    public static void main(String[] args) {
        MilitaryTime T = new MilitaryTime();
        System.out.println(T.toMilitary());
        System.out.println(T.toNormal());

        T.setTime(22, 34, 12);
        System.out.println(T.toMilitary());
        System.out.println(T.toNormal());
    }
}
