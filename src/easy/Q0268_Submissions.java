package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 268. 丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 * 进阶：
 * 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 *  
 * 示例 1：
 *
 * 输入：nums = [3,0,1]
 * 输出：2
 * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 *
 */
public class Q0268_Submissions {

    public static void main(String[] args) {
        int[] arr = {0,2,5,4,3};
        System.out.println(missingNumber_1(arr));
    }

    /**
     * 使用外部Set缓存
     * 先将[0,n]中的数字放入Set缓存，然后遍历数组，找到不存在的那一个数字
     * @param nums
     * @return
     */
    public static int missingNumber_1(int[] nums) {
        Set<Integer> set = new HashSet<>();
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

}
