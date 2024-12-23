package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            //最长公共子串 vs 最长公共子序列

            //我当前的想法：
            // 动态规划
            //1. 定义规划函数 dp[i][j] 表示a[0-i],b[0-j]的最长公共子串
            //2. 思考规划方程f[i][j] = f[i-1][j-1]
            // if a.len > b.len
            // swap
            // int m = a.len +1 //考虑空串
            // int n = b.len + 1 //考虑空串
            // 1~m; i~n
            // if : str[i-1] == str[j-1]
            // dp[i][j] == dp[i-1][j-1] + 1;
            // update-max: dp[i][j] > max
            //我的问题:
            //难以记住此类问题的动态规划方程
            //正确的思路：
            // 规划方程
            //思维链：
            if(a.length() > b.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            a = " "+a;
            b = " " + b;
            int m = a.length();
            int n = b.length();
            int[][] dp = new int[m][n];
            int max = 0;
            int maxIndex = 0;
            for(int i = 1; i < m; i++) {
                for(int j = 1; j < n; j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        maxIndex = i;
                    }
                }
            }
            System.out.println(a.substring(maxIndex+1 - max,maxIndex+1));
        }
    }
}
