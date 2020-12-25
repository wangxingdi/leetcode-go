package easy;

/**
 * 172. 阶乘后的零
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * 示例 1:
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 *
 * 示例 2:
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 *
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 */
public class Q0172_FactorialTrailingZeroes {

    /**
     * 思路1：将阶乘算出来，然后通过逐渐%10来判断有多少个0。这种方法易溢出，且运算量大；
     * 思路2：可以通过判断每个数可以分解出因子5的个数之和；
     * 思路3：
     * @param args
     */
    public static void main(String[] args) {
        Q0172_FactorialTrailingZeroes clazz = new Q0172_FactorialTrailingZeroes();

    }

    /**
     * 思路3：
     * 每隔5个数出现一次5；
     * 每隔25个数出现一个25；
     * ...
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int res = 0;
        while(n>0){
            res += (n/5);
            n /= 5;
        }
        return res;
    }
}
