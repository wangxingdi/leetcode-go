package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. 汇总区间
 * 给定一个无重复元素的有序整数数组 nums 。
 *
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 *
 * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
 *
 * "a->b" ，如果 a != b
 * "a" ，如果 a == b
 *
 * 示例 1：
 * 输入：nums = [0,1,2,4,5,7]
 * 输出：["0->2","4->5","7"]
 * 解释：区间范围是：
 * [0,2] --> "0->2"
 * [4,5] --> "4->5"
 * [7,7] --> "7"
 * =======================
 * 思考1：需要判断一个元素和其后面的元素是否连续
 */
public class Q228_SummaryRanges {

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        System.out.println(summaryRanges_1(arr));
    }

    public static List<String> summaryRanges_1(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(null==nums || 0==nums.length){
            return list;
        }
        int left = 0;
        //如果只有一个元素
        if(1==nums.length){
            list.add(""+nums[0]);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]!=1){
                if(nums[i-1]==nums[left]){
                    list.add(""+nums[left]);
                }else{
                    list.add(""+nums[left]+"->"+nums[i-1]);
                }
                left = i;
                if(i==nums.length-1){
                    list.add(""+nums[i]);
                }
            }else{
                //最后一个元素
                if(i==nums.length-1){
                    list.add(""+nums[left]+"->"+nums[i]);
                }
            }
        }
        return list;
    }

}
