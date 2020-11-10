package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. 存在重复元素 II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。

 * 示例 1:
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 *
 * ========================
 * 疑问1：使用暴力方式求解，很可能会遇到运算时间超时的情况；
 * 疑问2：因为需要保证两个目的元素的下标差距不能超过k，那么就无法使用先排序再遍历的方式，除非在排序时记录原始下标；
 */
public class Q0219_ContainsDuplicate2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate_1(arr, 3));
    }

    /**
     * 哈希缓存
     * 使用哈希表进行缓存，如果存在则返回true，否则放入；
     * 最后需要始终保持哈希表中最多有k个元素，如果超过就删除最先进入的元素，
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate_1(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
