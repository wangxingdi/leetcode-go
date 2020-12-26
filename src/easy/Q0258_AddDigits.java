package easy;

/**
 * JUST_ONCE
 * 258. 各位相加
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 *
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 */
public class Q0258_AddDigits {

    public static void main(String[] args) {
        Q0258_AddDigits clazz = new Q0258_AddDigits();

    }

    /**
     * 循环计算
     * @param num
     * @return
     */
    public int addDigits_1(int num) {
        if(num<10){
            return num;
        }
        int sum = getBitSum(num);
        while(sum>=10){
            sum = getBitSum(sum);
        }
        return sum;
    }

    /**
     * 按位求和
     */
    private int getBitSum(int num){
        int res = 0;
        while(num!=0){
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    /**
     * 进阶，这种方式还不明白
     * @param num
     * @return
     */
    public int addDigits_2(int num) {
        if(0==num){
            return 0;
        }
        return num%9==0 ? 9 : num%9;
    }

    /**
     * 进阶，这种方式还不明白
     * @param num
     * @return
     */
    public int addDigits_3(int num) {
        return (num - 1) % 9 + 1;
    }

}
