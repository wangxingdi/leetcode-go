package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: true
 */
public class Q217_ContainsDuplicate {

    public static void main(String[] args) {
        Q217_ContainsDuplicate solution = new Q217_ContainsDuplicate();
        int[] arr = {1,2,5,9,7,5};
        System.out.println(solution.containsDuplicate_1(arr));
    }

    /**
     * 暴力方式，嵌套for循环对比
     * @param nums
     * @return
     */
    public boolean containsDuplicate_1(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 使用Set作为缓存容器，记录已经遍历过的元素
     * @param nums
     * @return
     */
    public boolean containsDuplicate_2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            curr++;
            if(curr!=set.size()){
                return true;
            }
        }
        return false;
    }

    //排序后再查找


}
