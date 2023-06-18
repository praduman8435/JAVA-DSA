package DP;
import java.util.*;

/*

coins change is the variation of unbounded Knapsack

coin[] = 1, 2, 3
sum = 4                                  {1,1,1,1},{1,1,2},{2,2},{1,3}

coins = 2, 5, 3, 6
sum = 10                                 {2,2,2,2,2},{2,2,3,3},{2,3,5},{5,5}

*/
public class Coin_Change {
    public static int coinChange(int coins[], int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];

        //initialise -> sum is 0
        //i->coins       j->sum
        for (int i=0; i<n+1; i++){
            dp[i][0] = 1;
        }

        for (int j=1; j<sum+1; j++){
            dp[0][j] = 0;
        }

        for (int i=1; i<n+1; i++){
            for (int j=1; j<sum+1; j++){
                if (coins[i-1] <= j){
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int sum = 4;
        System.out.println(coinChange(coins, sum));
    }
}

/*

output
4

*/