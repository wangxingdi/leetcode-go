package easy;

/**
 * NO_IDEA
 * 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 示例 1：
 *
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 */
public class Q0198_HouseRobber {

    public static void main(String[] args) {
        Q0198_HouseRobber clazz = new Q0198_HouseRobber();
        int[] a = {1,5,8,3};
        System.out.println(clazz.rob_1(a));
        System.out.println(clazz.rob_2(a));
    }

    /**
     * 数组缓存 + 动态规划
     * 对于第i建房子来说，你有两种选择：
     *  1. 第一种偷，那么最大收益会是前面i-2间房子的最大收益+第i建房子中钱的数量；
     *  2. 第二种不偷，那么最大的收益是前面i-1间房子的最大的收益；
     *  即转移方程：dp[i] = max(dp[i−2] + nums[i], dp[i−1])
     *  边界条件是只有一间或者两间房子的情况
     * @param nums 钱
     * @return max
     */
    private int rob_1(int[] nums) {
        if(null==nums || nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] moneys = new int[nums.length];
        moneys[0] = nums[0];
        moneys[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            moneys[i] = Math.max(moneys[i-1], moneys[i-2]+nums[i]);
        }
        return moneys[moneys.length-1];
    }

    /**
     * 变量缓存 + 动态规划
     * 对于解法rob_1()，我观察到使用的数组缓存中，每次其实只有最后两个参与了运算，所以可以使用两个变量替换掉数组；
     * @param nums 钱数
     * @return max
     */
    private int rob_2(int[] nums) {
        if(null==nums || nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            int tmp = b;
            b = Math.max(a+nums[i], b);
            a = tmp;
        }
        return b;
    }


}
