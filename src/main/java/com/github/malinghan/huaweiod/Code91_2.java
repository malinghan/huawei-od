package com.github.malinghan.huaweiod;

import java.util.*;

public class Code91_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(dfs(0,0,m,n));
    }

    private static int dfs(int i, int j, int m, int n) {
        if(n == i || m == j) {
            return 1;
        }
        return dfs(i+1, j, m, n) + dfs(i, j+1, m, n);
    }
}
