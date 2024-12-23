package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        n = n + 1;
        m = m + 1;
        int[][] dp = new int[n][m];
        //System.out.println(n);
        //System.out.println(m);
        for(int i = 0 ; i < n; i++) {
            dp[i][0] = 1;
        }
        for(int j = 0 ; j < m; j++) {
            dp[0][j] = 1;
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                //System.out.println(dp[i][j]);
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}
