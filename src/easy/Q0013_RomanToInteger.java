package easy;

/**
 * 13. 罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 *
 * 输入: "III"
 * 输出: 3
 */
public class Q0013_RomanToInteger {

    public static void main(String[] args) {
        Q0013_RomanToInteger clazz = new Q0013_RomanToInteger();
        System.out.println(clazz.romanToInt_1("XXVII"));
    }

    /**
     * 和十进制权重不同，罗马数字只是简单的按位求和，从题目中获取这一信息很重要，
     * 但也存在特殊情况：小数位于大数左侧，表示小数是个负数，也就是需要做减法。
     * 这样就可以采取依次比较的方式来处理
     * @param s
     * @return
     */
    public int romanToInt_1(String s) {
        int res = 0;
        for(int i=0;i<s.length()-1;i++){
            if(reverse(s.charAt(i)) >= reverse(s.charAt(i+1))){
                res += reverse(s.charAt(i));
            }else{
                res -=reverse(s.charAt(i));
            }
        }
        res += reverse(s.charAt(s.length()-1));
        return res;
    }

    /**
     * 这是一个公共的方法，将罗马数字转换为阿拉伯数字
     * @param ch
     * @return
     */
    public int reverse(Character ch){
        if('I'==ch){
            return 1;
        }else if('V'==ch){
            return 5;
        }else if('X'==ch){
            return 10;
        }else if('L'==ch){
            return 50;
        }else if('C'==ch){
            return 100;
        }else if('D'==ch){
            return 500;
        }else if('M'==ch){
            return 1000;
        }else{
            return 0;
        }
    }
}
