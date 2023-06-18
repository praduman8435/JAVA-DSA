package DP;
import java.util.*;
/*

A sequence of a string is a new string generated from the original string with some characters deleted without changing the relative order of the remaining characters

str1 = "abcde", str2 = "ace"
ans = 3 || "ace"

str1 = "abcdge", str2 = "abedg"
ans = 4 || "abdg"

*/
public class Longest_Common_Subsequence_tabulation {
        public static int lcstabulation(String str1, String str2) {
            int n = str1.length();
            int m = str2.length();

            int dp[][] = new int[n + 1][m + 1];

            for (int i = 0; i < n+1; i++) {
                for (int j = 0; j < m+1; j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 0;
                    }
                }
            }

            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < m+1; j++) {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        int ans1 = dp[i-1][j];
                        int ans2 = dp[i][j-1];
                        dp[i][j] = Math.max(ans1, ans2);
                    }
                }
            }
            return dp[n][m];
        }
        public static void main(String[] args) {
            String str1 = "abcdge";
            String str2 = "abedg";

            System.out.println(lcstabulation(str1, str2));
        }
    }

/*

output
4

*/