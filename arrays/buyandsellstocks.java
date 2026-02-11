package arrays;

public class buyandsellstocks {
    public static int buyandsell(int[] prices){
        int buyprice= Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit = prices[i]-buyprice;        // it calculates today's profit
                maxprofit=Math.max(maxprofit, profit);  //maxprofit saare dino ka profit rhega aur profit m sirf aaj ka profit
             } else{
                buyprice = prices[i];  // jb(buyprice>=prices[i]) tb loss hoga toh us din sell krne se better h ki buy krle vo stock
             }
            
        } 
        return maxprofit;   
  }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("The maximum profit is = " + buyandsell(prices));
        
        
    }
}
