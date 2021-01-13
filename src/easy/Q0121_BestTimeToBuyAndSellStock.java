package easy;

/**
 * JUST_ONCE
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
public class Q0121_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    /**
     * 使用缓存 + 动态规划
     * 使用一个缓存数组，记录每天如果卖出股票，当天的最大收益；
     * 然后再遍历这个缓存数组，计算其中的最大值就是最大收益；
     * 这种方式无法分辨到底是哪天买入，只能分辨出哪天卖出了；
     * @param prices
     * @return
     */
    public int maxProfit_1(int[] prices) {
        if(null==prices || 2>prices.length){
            return 0;
        }
        int[] maxArr = new int[prices.length];
        maxArr[0] = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            maxArr[i] = prices[i] - min > 0 ? prices[i] - min : 0;
            min = Math.min(min, prices[i]);
        }
        int max = 0;
        for(int i=0;i<maxArr.length;i++){
            max = Math.max(max, maxArr[i]);
        }
        return max;
    }

    /**
     * 缓存 + 动态规划
     * 在解法maxProfit_1()之中，我使用了一个数组最为缓存，但是后来发现这个数组其实是不必要的，
     * 因为我只需要记录“目前为止最小的价格”和“目前为止最大的收益”即可；
     * @param prices
     * @return
     */
    public int maxProfit_2(int[] prices) {
        if(null==prices || 2>prices.length){
            return 0;
        }
        //目前为止最小的价格
        int minPrice = prices[0];
        //目前为止最大的收益
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }

    /**
     * 缓存 + 同速同向双指针
     * 在同一次遍历，两个指针同时指向同一个元素。如果当前元素比目前最小的价格还小，则只缓存；
     * 否则，判断当前元素的收益与目前最大的收益谁更大；
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
