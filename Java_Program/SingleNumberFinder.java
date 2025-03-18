import java.util.HashMap;

public class SingleNumberFinder {

    public int singleNumberUsingMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }

    public int singleNumberUsingXOR(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumberFinder finder = new SingleNumberFinder();
        int[] nums = {4, 1, 2, 1, 2};

        // Using HashMap method
        int uniqueUsingMap = finder.singleNumberUsingMap(nums);
        System.out.println("Unique Number (Using HashMap): " + uniqueUsingMap);

        // Using XOR method
        int uniqueUsingXOR = finder.singleNumberUsingXOR(nums);
        System.out.println("Unique Number (Using XOR): " + uniqueUsingXOR);
    }
}
