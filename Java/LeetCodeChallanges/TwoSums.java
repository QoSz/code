import java.util.HashMap;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (num_map.containsKey(complement)) {
                return new int[] { num_map.get(complement), i };
            }

            num_map.put(nums[i], i);
        }

        throw new IllegalArgumentException("no match found!");
    }

    public static void main(String[] args) {
        TwoSums s = new TwoSums();

        int[] nums = { 2, 7, 11, 15 };

        System.out.printf("[%d, %d]", s.twoSum(nums, 9)[0], s.twoSum(nums, 9)[1]);
    }
}
