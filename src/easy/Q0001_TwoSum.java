package easy;

import util.DateUtils;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1. 两数之和
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Q0001_TwoSum {

    public static void main(String[] args) {
        String timestamp = DateUtils.getTimestamp();
        System.out.println("===当前时间戳: "+timestamp);
        Q0001_TwoSum clazz = new Q0001_TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //方式1
        int[] res_20200920211143 = clazz.twoSum_20200920211143(nums, target);
        System.out.println(Arrays.toString(res_20200920211143));
        //方式2
        int[] res_20200920212126 = clazz.twoSum_20200920212126(nums, target);
        System.out.println(Arrays.toString(res_20200920212126));
        //方式3
        int[] res = clazz.twoSum_3(nums, target);
        System.out.println(Arrays.toString(res));
    }

    /**
     * 暴力求解,双指针,固定其中一个指针,移动另一个指针;
     * 由于额外的存储空间为常数,所以空间复杂度为O(1);
     * 由于使用依次遍历的双指针方式,时间复杂度为i * (length-i),即O(n*n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_20200920211143(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] ==target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    /**
     * HashMap缓存法,一边遍历,一边缓存;
     * 由于使用了额外的空间用来缓存最多n个元素,所以空间复杂度是O(n);
     * 由于只有一次遍历,所以时间复杂度也是O(n);
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_20200920212126(int[] nums, int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);
                res[1] = i;
            }else{
                map.put(target-nums[i], i);
            }
        }
        return res;
    }

    /**
     * 暴力求解,双指针,两个指针都从起始元素遍历到终止元素，存在重复计算的情况
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_3(int[] nums, int target){
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
