import java.util.*;

public class DP {

    public static int countWays(int n) {
        if(n == 1 ) {
            return 1;
        }
        if(n < 0) return 0;
        return countWays(n-1)+countWays(n-2);
    }

    public static int countWays1(int n,int ways[]) {
        Arrays.fill(ways, -1);

        if(n == 1) return 1;
        if(n < 0) return 0;

        if(ways[n] != -1) {
            return ways[n];
        }

        ways[n] = countWays1(n-1, ways) + countWays1(n-2, ways);
        return ways[n];
    }

    public static void main1() {
      int n = 6;
      int ways[] = new int[n+1];
      System.out.println(countWays1(6, ways));
    }

    public static int countWaysTab(int n) {
        int dp[] = new int[n+1];

        dp[0] = 1;
        /* tabulation loop */
        for(int i=1; i<=n ; i++) {
            if(i == 1) {
                dp[i]  = dp[i-1] + 0;
            } else {
            dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
        /* System.out.println(countWaysTab(5)); */
    }

    public static int knapsack(int val[], int wt[], int W, int n) {
        if(W == 0 || n == 0) {
            return 0;
        }

        if(wt[n-1] <= W) { /* valid */
            /* include */
            int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1);
            /* exclude */
            int ans2 = knapsack(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        } else {
            return knapsack(val, wt, W, n-1);
        }
    }

    public static void main2() {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println(knapsack(val, wt, W, val.length));
    }

    public static int knapsackM(int val[], int wt[], int W, int n, int dp[][]) {
        if(W == 0 || n == 0) {
            return 0;
        }
        
        if(dp[n][W] != -1) {
            return dp[n][W];
        }

        if(wt[n-1] <= W) {
            /* include */
            int ans1 = val[n-1] + knapsackM(val, wt, W-wt[n-1], n-1, dp);
            /* exclude */
            int ans2 =knapsackM(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = knapsackM(val, wt, W, n-1, dp);
            return dp[n][W];
        }

    }


    public static void main3() {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
       // System.out.print(knapsackM(val, wt, W, val.length, dp));
        System.out.println(knapsackTab(val, wt, W));
    }

    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<dp.length; i++) { /* 0th Col */
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++) { /* 0th Row */
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++) {
           for(int j=1; j<W+1; j++) {
            int v = val[i-1]; /* ith item val */
            int w = wt[i-1]; /* ith item wt */
            if(w <= j) {
                int incProfit = v + dp[i-1][j-w];
                int excProfit = dp[i-1][j];
                dp[i][j] = Math.max(incProfit, excProfit);
            } else {
                int excProfit = dp[i-1][j];
                dp[i][j] = excProfit;
            } 
           }
        }
        return dp[n][W];
    }

    public static boolean targetSumSubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        /* i = items & j = target sum */
        for(int i=0; i<n+1; i++) {
            dp[i][0] = true;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<sum+1; j++) {
                int v = arr[i-1];
                /* include */
                if(v <=j && dp[i-1][j-v] == true) {
                    dp[i][j] = true;
                }
                /* exclude */
                else if(dp[i-1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][sum];
    }

    public static void main4() {
        int arr[] = {4, 2, 7, 1, 3};
        int sum = 10;
        System.out.println("\n\n"+targetSumSubset(arr, sum));
        
    }

    public static int unboundedKnapsack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0; i<n+1; i++) {
            dp[i][0] = 0;
        }
        for(int j=0; j<W+1; j++) {
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<W+1; j++) {
                if(wt[i-1] <= j) {
                    dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];

        /* intialize sum -> 0 */
        /* i-> coins; j-> sum/change */
        for(int i=0; i<n+1; i++) {
            dp[i][0] = 1;
        }
        for(int j=1; j<sum+1; j++) {
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<sum+1; j++) {
                if(coins[i-1] <= j) {
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main5() {
        int coins[] = {1, 2, 3};
        int sum = 4;
        System.out.println(coinChange(coins, sum));
    }

    public static int rodCutting(int length[], int price[], int L) {
        int n = price.length;
        int dp[][] = new int[n+1][L+1];

        for(int i=0; i<n+1; i++) {
            for(int j=0; j<L+1; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<L+1; j++) {
                /* valid */
                if(length[i-1] <= j) {
                 dp[i][j] = Math.max(price[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][L];
    }


    public static void main6() {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int L = 8;
        System.out.println(rodCutting(length, price, L));
       

    }

    public static int lcs(String str1, String str2, int n, int m) {

        if(n == 0 || m == 0) {
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)) {
            return lcs(str1, str2, n-1, m-1) + 1;
        } else {
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }

    public static void main7() {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();
        System.out.println(lcs(str1, str2, n, m));
        
    }

    public static int lcsM(String str1, String str2, int n, int m, int dp[][]) {

        if(n == 0 || m == 0) {
            return 0;
        }

        if(dp[n][m] != -1) {
            return dp[n][m];
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)) {
            dp[n][m] = lcsM(str1, str2, n-1, m-1, dp) + 1;
        } else {
            int ans1 = lcsM(str1, str2, n-1, m, dp);
            int ans2 = lcsM(str1, str2, n, m-1, dp);
            dp[n][m] = Math.max(ans1, ans2);
        }

        return dp[n][m];

    }


    public static void main8() {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcsM(str1, str2, n, m, dp));
    }

    public static int lcsTab(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<m+1; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
             }
        }
        return dp[n][m];
    }
    public static void main9() {
        String str1 = "abcde";
        String str2 = "abcde";
        System.out.println(lcsTab(str1, str2));
        
    }

    public static int longestCommonSubstring(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int ans = 0;
        
        /* intitalize */

        for(int i=0; i<n+1; i++) {
            for(int j=0; j<m+1; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        /* bottom up */
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    public static void main10() {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        System.out.println(longestCommonSubstring(str1, str2));
        

    }

    public static int lcs1(int arr[], int arr2[]) {
        int n = arr.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];

        /* intialize */
        for(int i=0; i<n+1; i++) {
            dp[i][0] = 0;
        }
        for(int j=0; j<m+1; j++) {
            dp[0][j] = 0;
        }

        /* bottom up */
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(arr[i-1] == arr2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }

    public static int lis(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }

        int arr2[] = new int[set.size()];
        int i=0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        Arrays.sort(arr2);
        return lcs1(arr, arr2);
    }

    public static void main11() {
        int arr[] = {50, 3, 10, 7, 40, 80};
        System.out.println(lis(arr));
    }

    public static int editDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        /* intialize */
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<m+1; j++) {
                if(i == 0) {
                    dp[i][j] = j;
                }
                if(j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        /* bottom up */
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) { /* same */
                    dp[i][j] = dp[i-1][j-1];
                } else { /* diff */
                    int add = dp[i][j-1] + 1;
                    int del = dp[i-1][j] + 1;
                    int rep = dp[i-1][j-1] + 1;
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }
        return dp[n][m];
    }

    public static void main12() {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(editDistance(word1, word2));
    }
    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        /* intialize */
        dp[0][0] = true;
        /* pattern = " " */
        for(int i=1; i<n+1; i++) {
            dp[i][0] = false;
        }
        /* s = " " */
        for(int j=1; j<m+1; j++) {
            if(p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-1];
            }
        }

        /* bottom up */
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                /* case -> ith char == jth char || jth char == ? */
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } else if(p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        /* string -> n, pattern -> m */
        return dp[n][m];
    }

    public static void main13() {
        String s = "baaabab";
        String p = "*****ba*****ab";
        System.out.println(isMatch(s, p));
    }

    public static int catlan(int n) {
        if(n == 0 || n == 1) return 1;
        int ans = 0;

        for(int i=0; i<=n-1; i++) {
            ans += catlan(i)*catlan(n-i-1);
        }

        return ans;
    }

    public static int catalmaMem(int n, int dp[]) {
        if(n == 0 || n == 1) return 1;
        
        if(dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for(int i=0; i<=n-1; i++) {
            ans += catalmaMem(i, dp)*catalmaMem(n-i-1, dp);
            
        }
        return dp[n] = ans;
    }

    public static int catalanTab(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++) { /* Ci */
            for(int j=0; j<i; j++) {
                dp[i] += dp[j]*dp[i-j-1]; /* Ci = Cj * Ci-j-1 */
            }
        }
        return dp[n];
    }
    public static void main14() {
        int n = 4;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(catalmaMem(n, dp));
        
    }

    public static int countBST(int n) {
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;

        for(int i=2; i<n+1; i++) {
            for(int j=0; j<i; j++) {
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left*right;
            }
        }
        return dp[n];
    }

    public static int mountainRanges(int n) {
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;

        for(int i=2; i<n+1; i++) {
            for(int j=0; j<i; j++) {
                /*
                 * int inside = dp[j];
                 * int outside = dp[i-j-1];
                 */
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];

    }

    public static int mcm(int arr[], int i, int j) {
        if(i == j) return 0;

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcm(arr, i, k); /* Ai...Ak => arr[i-1]xarr[k] */
            int cost2 = mcm(arr, k+1, j); /* Ak....Aj => arr[k]xarr[j] */
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);

        }
        return ans;
    }
    public static void main15() {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        System.out.println(mcm(arr, 1, n-1));
    }

    public static int mcmMem(int arr[], int i, int j, int dp[][]) {
        if(i == j) return 0;

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcmMem(arr, i, k, dp);
            int cost2 = mcmMem(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return dp[i][j] = ans;
    }

    public static void main16() {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;

        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmMem(arr, 1, n-1, dp));
        
    }
    public static int mcmTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        /* intialization */
        for(int i=0; i<n; i++) {
            dp[i][i] = 0;
        }

        /* bottom up */
        for(int len=2; len<=n-1; len++) {
            for(int i=1; i<=n-len; i++) {
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<=j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[1][n-1];
    }

    public static void main17() {
        int arr[] = {1, 2, 3, 4, 3};
       
        System.out.println("\n"+mcmTab(arr));
        
    }

    public static int minPartition(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        int W = sum/2;
        int dp[][] = new int[n+1][W+1];

        /* bottom up */
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<W+1; j++) {
                if(arr[i-1] <= j) {
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]],dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main18() {
        int nums[] = {1, 6, 11, 5};
        System.out.println(minPartition(nums));
    }

    public static int minJumps(int nums[]) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[n-1] = 0;
        

        for(int i=n-2; i>=0; i--) {
            int steps = nums[i];
            int ans = Integer.MAX_VALUE;
            for(int j=i+1; j<=i+steps && j<n; j++) {
                if(dp[j] != -1) {
                    ans = Math.min(ans, dp[j]+1);
                }
            }
            if(ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }
        return dp[0];
    }
    public static void main19() {
        int nums[] = {2, 3, 1, 1, 4};
        System.out.println(minJumps(nums));
        
    }
    public static void main(String args[]) {
      main19();
        
    }
}