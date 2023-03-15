public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] nums = {-7,-3,2,3,11};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(m.sortedSquares(nums)[i]);
        }

    }


    public int[] sortedSquares(int[] nums) {
        int nums_length = nums.length;
        int[] result = new int[nums_length];
        int left = 0;
        int right = nums_length - 1;
        int resultIndex = nums_length - 1;
        
        while(left <= right) {
            int left_num = nums[left] * nums[left];
            int right_num = nums[right] * nums[right];
            if(left_num >= right_num) {
                result[resultIndex] = left_num;
                left ++;
            } else {
                result[resultIndex] = right_num;
                right--;
            }
            resultIndex--;
        }
        return result;
    }


}
