package easy;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 */
public class Q0067_AddBinary {
    public static void main(String[] args) {
        Q0067_AddBinary clazz = new Q0067_AddBinary();
        System.out.println(clazz.addBinary("10010", "10101"));
    }

    /**
     * 如何将一个char转换为int呢？
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        String res = "";
        int power = 0;
        while(i>=0 && j>=0){
            int m = a.charAt(i--) - 48;
            int n = b.charAt(j--) - 48;
            res = (m+n+power)%2 + res;
            power = (m+n+power)/2;
        }
        while(i>=0){
            int m = a.charAt(i--) - 48;
            res = (m+power)%2 + res;
            power = (m+power)/2;
        }
        while(j>=0){
            int n = b.charAt(j--) - 48;
            res = (n+power)%2 + res;
            power = (n+power)/2;
        }
        if(0!=power){
            res = power + res;
        }
        return res;
    }
}
