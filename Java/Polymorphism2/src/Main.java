public class Main {
    public static void main(String[] args) {
        Fatty f = new Fatty();
        Food A = new Apple();
        Food O = new Orange();

        f.digest(A);
        f.digest(O);
    }
}
