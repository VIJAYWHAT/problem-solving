import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) { 
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
