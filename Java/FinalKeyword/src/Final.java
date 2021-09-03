public class Final {
    private int sum;
    private final int NUMBER;

    public Final(int number) {
        NUMBER = number;
    }

    public void add() {
        sum += NUMBER;
    }

    @Override
    public String toString() {
        return String.format("The sum is %d\n", sum);
    }
}
