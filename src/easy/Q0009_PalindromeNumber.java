package easy;

public class Q0009_PalindromeNumber {

    public static void main(String[] args) {
        Q0009_PalindromeNumber clazz = new Q0009_PalindromeNumber();
        System.out.println(clazz.isPalindrome(12121));
    }

    /**
     * 先翻转，然后判断翻转后和翻转前是否相等
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int tmp = x;
        int reverse = 0;
        while(x!=0){
            int cur = x % 10;
            x /= 10;
            if(reverse>Integer.MAX_VALUE/10 || reverse==Integer.MAX_VALUE && cur>7){
                return false;
            }
            reverse = reverse * 10 + cur;
        }
        if(tmp==reverse){
            return true;
        }else{
            return false;
        }
    }
}
