package easy;

/**
 * 367. 有效的完全平方数
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *
 * 说明：不要使用任何内置的库函数，如  sqrt。
 *
 * 示例 1：
 * 输入：16
 * 输出：True
 *
 * 示例 2：
 * 输入：14
 * 输出：False
 */
public class Q0367_ValidPerfectSquare {

    /**
     * 二分法查找，注意乘法超出范围的问题
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while(left<=right){
            int mid = (left+right)/2;
            if((long)mid*mid==num){
                return true;
            }else if((long)mid*mid<num){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left==right;
    }
}
