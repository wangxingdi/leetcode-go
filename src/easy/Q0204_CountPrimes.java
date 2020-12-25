package easy;

import java.util.Arrays;

/**
 * 204. 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例 1：
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class Q0204_CountPrimes {

    public static void main(String[] args) {
        Q0204_CountPrimes clazz = new Q0204_CountPrimes();
//        System.out.println(clazz.countPrimes(499979));
    }

    /**
     * 暴力，容易运行时间过长
     * @param n
     * @return
     */
    public int countPrimes_1(int n) {
        int res = 0;
        for(int i=2;i<n;i++){
            int t = 2;
            boolean flag = true;
            while(t<i){
                if(i%t==0){
                    flag = false;
                    break;
                }
                t++;
            }
            if(flag){
                res++;
            }
        }
        return res;
    }

    /**
     * 筛子法
     * @param n
     * @return
     */
    public int countPrimes_2(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        //先判断当前数是否是质数，如果不是，那么它的倍数必然已经遍历过
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*2;j<n;j+=i){
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count++;
    }
}
