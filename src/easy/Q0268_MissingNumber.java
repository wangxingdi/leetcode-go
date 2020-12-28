package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 268. 丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 * 示例 1：
 * 输入：nums = [3,0,1]
 * 输出：2
 * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 进阶：
 * 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 */
public class Q0268_MissingNumber {
    public static void main(String[] args) {
        Q0268_MissingNumber clazz = new Q0268_MissingNumber();
    }

    /**
     * 使用缓存
     * @param nums
     * @return
     */
    public int missingNumber_1(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 使用异或：a^a = 0; a^0 = a;
     */
    public int missingNumber_2(int[] nums) {
        //手动补上[0, n]的最后一位
        int miss = nums.length;
        for(int i=0;i<nums.length;i++){
            miss ^= nums[i] ^ i;
        }
        return miss;
    }
}
