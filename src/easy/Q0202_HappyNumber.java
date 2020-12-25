package easy;

/**
 * 202. 快乐数
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 *
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 *
 * 示例：
 * 输入：19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class Q0202_HappyNumber {

    private static int count = 0;

    public static void main(String[] args) {
        Q0202_HappyNumber clazz = new Q0202_HappyNumber();
        clazz.isHappy(98563);
        System.out.println(count);
    }

    /**
     * 快慢指针
     * 如果两个人从同一个位置出发，经过N个步骤后相等了，说明两个人进入了一个循环内，且刚走完一个循环
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            slow = getSum(slow);
            fast = getSum(fast);
            fast = getSum(fast);
            count++;
        }while(fast!=slow);
        return slow == 1;
    }

    /**
     * 按位求和
     * @param num
     * @return
     */
    public int getSum(int num){
        int sum = 0;
        while(num!=0){
            int a = num % 10;
            sum += a * a;
            num /= 10;
        }
        return sum;
    }

}
