package multidimensionalarrays;

public class Main {

    public static void printTable(int[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column< x[row].length; column++) {
                System.out.print(x[row][column] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] twoD = {{12, 13, 14, 15}, {22, 23, 24, 25}, {32, 33, 34, 35}};
        int[][] twoD2 = {{12, 13, 15}, {22, 23, 24, 25}, {536}, {102, 114}};

        System.out.println("First Table");
        printTable(twoD);
        System.out.println();
        System.out.println("Second Table");
        printTable(twoD2);
    }
}
