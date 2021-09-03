package enhancedforloop;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = {3, 4, 3, 4, 6, 5};
	    int total = 0;

	    for (int x : numbers) {
	        total += x;
        }

        System.out.println("The total is: " + total);
    }
}
