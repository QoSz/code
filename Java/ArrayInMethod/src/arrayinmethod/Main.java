package arrayinmethod;

public class Main {

    public static void addfive(int[] five) {
        for (int i = 0; i < five.length; i++) {
            five[i] += 5;
        }
    }

    public static void main(String[] args) {
	    int[] bucky = {1, 3, 5, 8, 10};

	    addfive(bucky);

	    for (int y : bucky) {
            System.out.println(y);
        }
    }
}
