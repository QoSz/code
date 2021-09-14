public class LinearSearch {
    private int[] _array;

    public void setArray(int[] array) {
        _array = array;
    }

    public int[] getArray() {
        return _array;
    }

    public int search(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
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
