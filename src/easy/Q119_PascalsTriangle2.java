package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 杨辉三角的第n+1行
 */
public class Q119_PascalsTriangle2 {

    public static void main(String[] args) {
        List<Integer> res = getRow(4);
        for(int i : res){
            System.out.print(i+",");
        }
    }

    public static List<Integer> getRow(int index){
        List<Integer> res = new ArrayList<Integer>();
        //排序负数索引
        if(index>=0){
            //第一行有且仅有一个1
            res.add(1);
            //其余行
            for(int i=1;i<=index;i++){
                //上一行最后直接追加1最为当前行的起始行
                res.add(1);
                //从起始行倒数第二个元素开始遍历到正数第二个结束,依次计算
                for(int j=res.size()-2;j>0;j--){
                    res.set(j, res.get(j) + res.get(j-1));
                }
            }
        }
        return res;
    }
}
