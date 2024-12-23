package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code61_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(count(m, n));
        }
    }

    private static int count(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        //不放苹果
        for(int j = 0 ; j  <= n; j++) {
            dp[0][j] = 1;
        }
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if (i < j) {
                    //有空盘的情况下，
                    //数量等于忽略一个空盘的数量，可以一直递推
                    dp[i][j] = dp[i][j-1];
                } else {
                    //每个盘子放一个苹果，即苹果数剩下i-j,继续递推直到j==1
                    dp[i][j] = dp[i][j-1] +dp[i-j][j];
                }
            }
        }
        return dp[m][n];
    }
}
