package easy;

/**
 * 171. Excel表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 示例 1:
 * 输入: "A"
 * 输出: 1
 *
 * 示例 2:
 * 输入: "AB"
 * 输出: 28
 *
 * 示例 3:
 * 输入: "ZY"
 * 输出: 701
 */
public class Q0171_ExcelSheetColumnNumber {

    public static void main(String[] args) {
        Q0171_ExcelSheetColumnNumber clazz = new Q0171_ExcelSheetColumnNumber();
        System.out.println(clazz.titleToNumber("Z"));
    }

    /**
     * A 65
     * a 97
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int len = s.length();
        int res = 0;
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            res = (ch - 64) + 26 * res;
        }
        return res;
    }
}
