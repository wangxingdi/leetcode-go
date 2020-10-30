package easy;

/**
 * 121. 买卖股票的最佳时机
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意：你不能在买入股票前卖出股票。
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 */
public class Q121_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    /**
     * 思路：
     * 可以看成是一个数组中，最大值和最小值的差，其中最大值要求必须在最小值后面；
     * 使用一个指针始终指向最小值，另一个指针依次移动，并求得正数差；
     * 由于要求最大值必须在最小值后面，所以两个指针可以在同一个循环中完成；
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            //如果是一个较小数，只缓存；如果是一个较大数，则进行运算
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else if(prices[i]-minPrice>maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }


}
