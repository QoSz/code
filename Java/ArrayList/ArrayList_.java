import java.util.ArrayList;

class ArrayList_ {
    public void addFive() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(7);
        a.add(10);
        a.add(77);

        System.out.println(a);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + 5);
        }
    }

    public static void main(String[] args) {
        ArrayList_ b = new ArrayList_();
        b.addFive();
    }
}