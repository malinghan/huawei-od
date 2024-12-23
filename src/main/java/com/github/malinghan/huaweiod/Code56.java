package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        if(n < 6) {
            System.out.println(0);
        }
        for(int i = 1; i <= n; i++) {
            if(isPerfect(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPerfect(int n) {
        int res = 0;
        for(int i = 1; i <= n / 2; i++) {
            if ( n % i == 0) {
                res += i;
            }
        }
        return  res == n;
    }
}
