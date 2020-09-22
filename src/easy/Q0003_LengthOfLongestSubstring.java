package easy;

import util.DateUtils;

import java.util.HashMap;
import java.util.HashSet;

/**
 *  无重复字符的最长子串
 *  给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q0003_LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println("===当前时间戳: "+DateUtils.getTimestamp());

        Q0003_LengthOfLongestSubstring clazz = new Q0003_LengthOfLongestSubstring();
        clazz.testPlus();

        String s = " ";
        clazz.lengthOfLongestSubstring_20200922110754(s);
    }

    /**
     * 最开始想法是: 1. 先固定一个指针，然后移动另一个指针，依次与缓存比较直到出现重复字符；
     * 2. 每次出现重复字符，缓存此时最长的长度；
     * 3. 移动固定指针，循环步骤1和步骤2；
     * 其实，可以通过缓存来获取固定指针的位置，这样会减少一层loop
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring_20200922110754(String s) {
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                //计算left应该的位置
                //错误点1: 这里的+1始终不怎么明白
//                left = Math.max(left, map.get(s.charAt(i)));
                left = Math.max(left, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
//            max = Math.max(max, i - left);
            max = Math.max(max, i-left+1);
        }
        return max;
    }


    /**
     * 测试在一个循环中，给i强行赋值会发生什么
     */
    public void testPlus(){
        for(int i=0;i<10;i++){
            System.out.println("此时i的值为: "+i);
            if(i==6){
                break;
            }
            i = 5;
            System.out.println("已经将5赋值给i");
        }
        System.out.println(" ".length());
    }
}
