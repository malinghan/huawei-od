package com.github.malinghan.huaweiod;

import java.util.Scanner;

/**
 * 动态规划
 * dp[i] 表示包含i的最长子串的长度
 */
public class Code92_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String s = in.nextLine();
            int len = s.length();
            int[] dp = new int[len+1];
            int max = 0;
            for(int i = 1; i <= len; i++) {
                char tmp =  s.charAt(i-1);
                if (tmp >= '0' && tmp <= '9') {
                    //包含i的最长子串
                    dp[i] = dp[i-1] + 1;
                    max = Math.max(max, dp[i]);
                }
            }
            for(int i = 1; i <= len; i++) {
                if(dp[i] == max) {
                    System.out.print(s.substring(i - max, i));
                }
            }
            System.out.println("," + max);
        }
    }
}
