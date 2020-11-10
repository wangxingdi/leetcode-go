package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 * 1. 未实现，无思路
 * ======
 * 什么是杨辉三角：
 * 1. 第一行肯定有且仅有一个1；
 * 2. 除第一行之外的其余行，第一个元素和最后一个元素都是1，其他元素都是左上角和右上角的两数之和；
 */
public class Q0118_PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);
        for(List<Integer> list : res){
            System.out.println("");
            for(Integer i : list){
                System.out.print(i+",");
            }
        }
    }

    /**
     * 生成杨辉三角
     * 时间复杂度: O(n的平方)
     * 空间复杂度: O(n的平方)
     * @param numRows 杨辉三角前n行
     * @return
     */
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows<=0){
            return res;
        }else{
            //第一行有且仅有一个1
            List<Integer> first = new ArrayList<Integer>();
            first.add(1);
            res.add(first);
            //除第一个和最后一个元素外，均是上一个数组arr[c]和arr[c-1]之和
            for(int i=1;i<numRows;i++){
                //取上一个数组
                List<Integer> pre = res.get(i-1);
                //当前行
                List<Integer> curr = new ArrayList<Integer>();
                //当前行第一个元素为1
                curr.add(1);
                //当前行中间元素
                for(int j=1;j<i;j++){
                    curr.add(pre.get(j-1) + pre.get(j));
                }
                //当前行最后一个元素为1
                curr.add(1);
                res.add(curr);
            }
            return res;
        }
    }
}
