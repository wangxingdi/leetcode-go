package easy;

/**
 * JUST_ONCE
 * 231. 2的幂
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 * 输入: 1
 * 输出: true
 * 解释: 2的0次幂 = 1
 */
public class Q0231_PowerOfTwo {

    public static void main(String[] args) {
        Q0231_PowerOfTwo clazz = new Q0231_PowerOfTwo();
        System.out.println(clazz.isPowerOfTwo(10));
    }

    /**
     * 容易出错的地方在0和1两个特殊值
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if(0==n){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n /= 2;
        }
        return true;
    }

}
