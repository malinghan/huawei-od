package com.github.malinghan.huaweiod;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 注意审题
 * 题目没有说求最后一个节点的最长子序列
 */
public class Code103 {
    //最长递增子序列
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int[] dp = new int[n];
            //dp[0] = 1;
            Arrays.fill(dp,1);
            //他最多走的步数吗
            for(int i = 1; i < n; i++) {
                //dp[i] = 1;
                for(int j = 0; j < i; j++) {
                    if(arr[i] > arr[j]) {
                        dp[i] = Math.max(dp[i], dp[j]+1);
                    }
                }
                // System.out.println(dp[i]);
            }
            int res = 0;
            for(int value: dp) {
                res = Math.max(res, value);
            }
            System.out.println(res);
        }
    }
}
