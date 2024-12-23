package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(leven(a, b));
    }

    private static int findMin(int a, int b, int c) {
        a = Math.min(a, b);
        b = Math.min(b,c);
        return Math.min(a,b);
    }

    private static int leven(String a, String b) {
        //
        a = " " + a;
        b = " " + b;
        int n = a.length();
        int m = b.length();
        int cost = 0;
        int[][] lev = new int[n][m];

        for(int  i = 0; i < n; i++) {
            lev[i][0] = i;
        }
        for(int  j = 0; j < m; j++) {
            lev[0][j] = j;
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                //替换成本
                if (a.charAt(i) == b.charAt(j)) {
                    cost = 0;
                } else {
                    cost = 1;
                }
                lev[i][j] = findMin(
                        //新增一个字符
                        lev[i][j-1]+1,
                        //删除一个字符
                        lev[i-1][j] +1,
                        //替换一个字符
                        lev[i-1][j-1]+cost);
            }
        }
        return lev[n-1][m-1];
    }
}
