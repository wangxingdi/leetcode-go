package easy;

/**
 * 28. 实现 strStr()
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 */
public class Q0028_ImplementStrstr {

    public static void main(String[] args) {
        Q0028_ImplementStrstr clazz = new Q0028_ImplementStrstr();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(clazz.strStr(haystack, needle));
    }

    /**
     * 使用substring截取后依次比对
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if(null==haystack || null==needle){
            return -1;
        }
        int length1 = haystack.length();
        int length2 = needle.length();
        for(int i=0;i<length1-length2+1;i++){
            if(needle.equals(haystack.substring(i, i+length2))){
                return i;
            }
        }
        return -1;
    }

    /**
     * 想一想，是否可以不使用substring，只使用charAt()来实现？
     * 想一想，如何实现substring方法？
     */
    
}
