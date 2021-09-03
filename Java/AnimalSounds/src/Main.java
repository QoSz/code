public class Main {
    public static void main(String[] args) {
        Animals[] a = new Animals[3];
        Dog d = new Dog();
        Fish f = new Fish();
        Bird b = new Bird();

        a[0] = d;
        a[1] = f;
        a[2] = b;

        System.out.println("Enhanced for loop");

        for (Animals x : a) {
            x.noise();
        }

        System.out.println();
        System.out.println("Normal for loop");

        for (int i = 0; i < a.length; i++) {
            a[i].noise();
        }
    }
}
