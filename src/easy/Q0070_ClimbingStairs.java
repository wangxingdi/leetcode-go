package easy;

/**
 * NO_IDEA
 * 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 */
public class Q0070_ClimbingStairs {

    public static void main(String[] args) {
        Q0070_ClimbingStairs clazz = new Q0070_ClimbingStairs();
        System.out.println(clazz.climbStairs(10));
    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int level1 = 1;
        int level2 = 2;
        int res = 0;
        for(int i=3;i<=n;i++){
            res = level1 + level2;
            level1 = level2;
            level2 = res;
        }
        return res;
    }
}
