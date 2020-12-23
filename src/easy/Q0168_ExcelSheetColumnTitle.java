package easy;

/**
 * 168. Excel表列名称
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 示例 1:
 * 输入: 1
 * 输出: "A"
 *
 * 示例 2:
 * 输入: 28
 * 输出: "AB"
 *
 * 示例 3:
 * 输入: 701
 * 输出: "ZY"
 */
public class Q0168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Q0168_ExcelSheetColumnTitle clazz = new Q0168_ExcelSheetColumnTitle();
        System.out.println(clazz.convertToTitle(701));
    }

    /**
     *
     * @param n
     * @return
     */
    public String convertToTitle(int n) {
        String res = "";
        while(n!=0){
            int a = (n - 1) % 26;
            n = (n - 1) / 26;
            //往高位放
            res = (char)('A'+ a) + res;
        }
        return res;
    }
}
