package easy;

/**
 * 441. 排列硬币
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 *
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 *
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 *
 * 示例 1:
 * n = 5
 *
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 *
 * 因为第三行不完整，所以返回2.
 */
public class Q0441_ArrangingCoins {

    public static void main(String[] args) {
        Q0441_ArrangingCoins clazz = new Q0441_ArrangingCoins();
        System.out.println(clazz.arrangeCoins(1));
    }

    public int arrangeCoins(int n) {
        int t = n;
        for(int i=1;i<=n;i++){
            if(t-i>=0){
                t -= i;
            }else{
                return i - 1;
            }
        }
        return 0;
    }

    public int arrangeCoins_2(int n) {
        //为什么从0开始
        int left = 0;
        int right = n;
        while(left<=right){
            int mid = (left+right)/2;
            long sum = (long)(1+mid)*mid/2;
            if(sum==n){
                return mid;
            }else if(sum>n){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
}
