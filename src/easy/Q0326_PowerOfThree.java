package easy;

/**
 * 326. 3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3的x次方
 */
public class Q0326_PowerOfThree {

    /**
     * 反复去除以3，判断余数
     * @param n
     * @return
     */
    public boolean isPowerOfThree_1(int n) {
        while(n>=3){
            if(n%3!=0){
                return false;
            }else{
                n /= 3;
            }
        }
        return n==1;
    }
}
