public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[100];
        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i + 1;
        }


        BinarySearch L = new BinarySearch();
        // L.setArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        L.setArray(myIntArray);
        int i = L.search(L.getArray(), 65);
        L.verifyIndex(i);
    }
}
