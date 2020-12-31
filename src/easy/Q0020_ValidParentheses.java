package easy;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *   左括号必须用相同类型的右括号闭合。
 *   左括号必须以正确的顺序闭合。
 *   注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 * 输入: "()"
 * 输出: true
 */
public class Q0020_ValidParentheses {

    public static void main(String[] args) {
        Q0020_ValidParentheses clazz = new Q0020_ValidParentheses();
    }

    /**
     * 主校验方法
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(isLeft(s.charAt(i))){
                //如果是左括号,放入栈
                stack.push(getOpsite(s.charAt(i)));
            }else{
                //如果第一个就是右括号,则直接返回false
                if(stack.empty()){
                    return false;
                }
                if(s.charAt(i)!=stack.pop()){
                    return false;
                }
            }
        }
        //遍历完字符串后,如果栈为空,则表示匹配
        return stack.empty();
    }

    /**
     * 判断是否是左括号
     * @param ch
     * @return
     */
    private boolean isLeft(char ch){
        if('('==ch || '{'==ch || '['==ch){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 获取对立括号
     * @param ch
     * @return
     */
    private char getOpsite(char ch){
        if('('==ch){
            return ')';
        }else if('{'==ch){
            return '}';
        }else if('['==ch){
            return ']';
        }else{
            return ' ';
        }
    }
}
