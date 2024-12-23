package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        a = " " + a;
        b = " " + b;
        int m = a.length();
        int n = b.length();
        //以i,j结尾，包含i,j的最大公共子串
        int[][] dp = new int[m][n];
        int max = 0;
        int maxIndex = 0;
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        maxIndex = i;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
