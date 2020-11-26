package easy;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class Q0014_LongestCommonPrefix {

    public static void main(String[] args) {
        Q0014_LongestCommonPrefix clazz = new Q0014_LongestCommonPrefix();
        String[] arr = {"flower", "flow", "flig", "f"};
        System.out.println(clazz.longestCommonPrefix(arr));
    }

    /**
     * 按照数组横向比较
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs){
        //取数组第一个元素作为公共初始化前缀，注意边界条件
        String prefix = "";
        if(null==strs || strs.length==0){
            return "";
        }else{
            prefix = strs[0];
        }
        //截取终止下标(不包括)
        int subIndex = 0;
        //横向遍历
        for(int i=1;i<strs.length;i++){
            //依次比较每一个元素
            for(int j=0;j<strs[i].length()&&j<prefix.length();j++){
                if(strs[i].charAt(j)==prefix.charAt(j)){
                    subIndex = j+1;
                }else{
                    subIndex = j;
                    //存在不一致元素，结束当前循环
                    break;
                }
            }
            prefix = prefix.substring(0, subIndex);
            //如果prefix为空字符串,终止
            if(""==prefix){
                return "";
            }
        }
        return prefix;
    }

}
