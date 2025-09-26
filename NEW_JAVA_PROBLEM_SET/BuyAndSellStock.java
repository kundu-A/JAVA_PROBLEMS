/* Problem Statement - You are given an array prices where prices[i] is the price of a stock on day i. Find the
maximum profit you can achieve by choosing a day to buy and a later day to sell. */
import java.util.Scanner;

public class BuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Problem = Best time to buy and sell the stock");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int price[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            price[i]=sc.nextInt();
        int result1=solution1(price);
        System.out.println("Maximum profit: "+result1);
        System.out.println("*****************************************************");
        int result2=solution2(price);
        System.out.println("Maximum Profit: "+result2);
        sc.close();
    }
    public static int solution1(int[] price){
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            int temp=0;
            for(int j=i+1;j<price.length;j++){
                if(price[j]>price[i])
                    temp=price[j]-price[i];
                if(temp>maxProfit)
                    maxProfit=temp;
            }
        }
        return maxProfit;
    }
    public static int solution2(int[] price){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(price[i]<minPrice)
                minPrice=price[i];
            else if((price[i]-minPrice)>maxProfit)
                maxProfit=price[i]-minPrice;
        }
        return maxProfit;
    }
}
