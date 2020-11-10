package easy;

import java.util.*;

/**
 * 169. 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 *
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class Q0169_MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    /**
     * 使用map缓存元素和出现次数的映射
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>(nums.length/2)){
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * 排序思路，寻找中间值
     */
}
