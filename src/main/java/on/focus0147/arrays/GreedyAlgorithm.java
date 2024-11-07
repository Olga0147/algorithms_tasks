package on.focus0147.arrays;

public class GreedyAlgorithm {

    /**
     * Жадный алгоритм (англ. Greedy algorithm) — алгоритм,
     * заключающийся в принятии локально оптимальных решений на каждом этапе, допуская,
     * что конечное решение также окажется оптимальным.
     */
    public static void main(String[] args){
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

    /**
     * O(N)
     *
     * Ищем самый выгодный локальный день и в него продаем
     */
    public static int maxProfit(int[] prices) {
        int profitSum = 0;
        int currentProfit = 0;
        int currentMin = prices[0];

        for(int i = 1; i<prices.length;i++){
            if(prices[i-1]>prices[i]){
                currentMin = prices[i];
                profitSum += currentProfit;
                currentProfit = 0;
            }
            currentProfit = Math.max(currentProfit, prices[i]-currentMin);
        }
        return profitSum + currentProfit;
    }

    /**
     * Тут просто каждый раз продаем и покупаем.
     * С условием, что день продажи может совпадать с днем покупки.
     *
     * Для 1.2.3.4.5
     * Получается сумма = 5-4+4-3+3-2+2-1=5-1=4
     */
    public static int maxProfit2(int[] prices) {
        int profitSum = 0;
        int currentMin = prices[0];

        for(int i = 1; i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profitSum += prices[i]-currentMin;
            }
            currentMin = prices[i];
        }
        return profitSum;
    }

}
