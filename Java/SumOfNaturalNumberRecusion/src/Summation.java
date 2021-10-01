public class Summation {

    public int recursionSummation(int inputNumber) {
        if (inputNumber <= 1) {
            return inputNumber;
        }

        return inputNumber + recursionSummation(inputNumber - 1);
    }

    public static void main(String[] args) {
        Summation s = new Summation();

        System.out.println(s.recursionSummation(10));
        System.out.println(s.recursionSummation(3));
        System.out.println(s.recursionSummation(100));
    }
}
