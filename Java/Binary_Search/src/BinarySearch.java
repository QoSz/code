public class BinarySearch {
    private int[] _array;


    public void setArray(int[] array) {
        _array = array;
    }

    public int[] getArray() {
        return _array;
    }


    public int search(int[] list, int target) {
        int first = 0;
        int last = list.length - 1;

        while (first < last) {
            int midpoint = (first + last) / 2;

            if (list[midpoint] == target) {
                return midpoint;
            } else if (list[midpoint] < target) {
                first = midpoint + 1;
            } else {
                last = midpoint - 1;
            }
        }
        return -1;
    }

    public void verifyIndex(int i) {
        if (i != -1) {
            System.out.println("The value was found at index " + i);
        } else {
            System.out.println("The target value is not in the list");
        }
    }
}
