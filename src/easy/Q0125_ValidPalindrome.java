package easy;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class Q0125_ValidPalindrome {

    public static void main(String[] args) {
        Q0125_ValidPalindrome clazz = new Q0125_ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(clazz.isPalindrome(s));
    }

    /**
     * 1. 不知道判断数组的api；
     * 2. 不知道如何判断字母；
     * 3. 考虑的不周全
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        boolean flag = true;
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(Character.isDigit(l) && Character.isDigit(r)){
                //数字
                left++;
                right--;
                if(l!=r){
                    flag = false;
                    break;
                }
            }else if((l>='a'&&l<='z' || l>='A'&&l<='Z') && (r>='a'&&r<='z' || r>='A'&&r<='Z')){
                //字母
                left++;
                right--;
                if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                    flag = false;
                    break;
                }
            }else if(!Character.isDigit(l) && !(l>='a'&&l<='z' || l>='A'&&l<='Z')){
                //left非数字非字母
                left++;
            }else if(!Character.isDigit(r) && !(r>='a'&&r<='z' || r>='A'&&r<='Z')){
                //right非数字非字母
                right--;
            }else{
                //这里没有考虑全
                flag = false;
                left++;
                right--;
            }
        }
        return flag;
    }

    /**
     * 有一个方法可以判断是否是数字或者字母Character.isLetterOrDigit
     */

}
