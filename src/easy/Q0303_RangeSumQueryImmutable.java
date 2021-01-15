package easy;

/**
 * JUST_ONCE
 * 303. 区域和检索 - 数组不可变
 * 给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
 *
 * 实现 NumArray 类：
 *
 * NumArray(int[] nums) 使用数组 nums 初始化对象
 * int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
 *  
 * 示例：
 *
 * 输入：
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * 输出：
 * [null, 1, -1, -3]
 *
 * 解释：
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
 * numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
 * numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
 */
public class Q0303_RangeSumQueryImmutable {

    private int[] nums;

    /**
     * 构造函数，不解释
     * @param nums
     */
    public Q0303_RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
    }

    /**
     * 暴力法
     * @param i start
     * @param j end
     * @return sum
     */
    public int sumRange_1(int i, int j) {
        int res = 0;
        i = (i < 0 ? 0 : i);
        j = (j > nums.length - 1 ? nums.length - 1 : j);
        for(int m=i;m<=j;m++){
            res += nums[m];
        }
        return res;
    }

    /**
     * sum[i,j] = sum[0,j] - sum[0,i-1]
     * 注意i是否等于0
     * @param i start
     * @param j end
     * @return sum
     */
    public int sumRange_2(int i, int j) {
        int[] sumArr = new int[j+1];
        sumArr[0] = nums[0];
        for(int m = 1;m<=j;m++){
            sumArr[m] = sumArr[m-1] + nums[m];
        }
        if(i==0){
            return sumArr[j];
        }else{
            return sumArr[j] - sumArr[i-1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};
        Q0303_RangeSumQueryImmutable clazz = new Q0303_RangeSumQueryImmutable(arr);
        System.out.println(clazz.sumRange_1(0,2));
    }
}
