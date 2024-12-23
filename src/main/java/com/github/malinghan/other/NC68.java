package com.github.malinghan.other;

/**
 * 跳台阶
 */
public class NC68 {
    public int jumpFloor(int target) {
        int[] dp = new int[target+1];
        for(int i=0;i<=target;i++){
            if(i<=2) dp[i] = i;
            else dp[i] = dp[i-1] +dp[i-2];
        }
        return dp[target];
    }
}
