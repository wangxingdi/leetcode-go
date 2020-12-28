package easy;

/**
 * 263. 丑数
 * 编写一个程序判断给定的数是否为丑数。
 *
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例 1:
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 *
 * 说明：
 * 1 是丑数。
 * 输入不会超过 32 位有符号整数的范围: [−231,  231 − 1]。
 */
public class Q0263_UglyNumber {

    public static void main(String[] args) {
        Q0263_UglyNumber clazz = new Q0263_UglyNumber();
    }

    /**
     * 乘法结合律？
     * @param num
     * @return
     */
    public boolean isUgly(int num) {
        if(num<=0){
            return false;
        }
        while(num%2==0){
            num /= 2;
        }
        while(num%3==0){
            num /= 3;
        }
        while(num%5==0){
            num /= 5;
        }
        return num==1;
    }
}
