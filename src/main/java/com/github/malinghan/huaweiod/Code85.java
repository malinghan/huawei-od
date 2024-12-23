package com.github.malinghan.huaweiod;

import java.util.Scanner;

/**
 * 最长回文子串求法1：动态规划
 * int[][] dp[i][j] 表示s[i-1,j]是否是回文串
 */
public class Code85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            int max = 1;
            int n = s.length();
            int[][] dp = new int[n][n];
            for(int i = 0; i < n; i++) {
                dp[i][i] = 1;
            }
            int start = 0;
            int end = 0;
            for(int i = n-1; i >= 0; i--) {
                for(int j = i; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (j-i < 3) {
                            dp[i][j] = 1;
                        } else {
                            dp[i][j] = dp[i+1][j-1];
                        }
                        if(dp[i][j] == 1) {
                            if(j-i+1 > max) {
                                max = j - i + 1;
                                start = i;
                                end  = j;
                            }
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}
