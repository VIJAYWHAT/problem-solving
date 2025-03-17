import java.util.HashMap;

public class single_number {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums) {
            if(map.get(num) == 1){
                return num;
            }
        }
        return 0;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
