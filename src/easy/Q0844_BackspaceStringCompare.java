package easy;

import java.util.Stack;

/**
 * JUST_ONCE
 * 844. 比较含退格的字符串
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 * 示例 1：
 *
 * 输入：S = "ab#c", T = "ad#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “ac”。
 */
public class Q0844_BackspaceStringCompare {

    public static void main(String[] args) {
        Q0844_BackspaceStringCompare clazz = new Q0844_BackspaceStringCompare();
        System.out.println(clazz.backspaceCompare("abd", "abd#d"));
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stacks = handle(S);
        Stack<Character> stackt = handle(T);
        while(!stacks.empty() && !stackt.empty()){
            if(!stacks.pop().equals(stackt.pop())){
                return false;
            }
        }
        if(!stacks.empty() || !stackt.empty()){
            return false;
        }
        return true;
    }

    private Stack<Character> handle(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if('#'==s.charAt(i)){
                if(!stack.empty()){
                    stack.pop();
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack;
    }
}
