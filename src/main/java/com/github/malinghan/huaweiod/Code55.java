package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if ( i % 7 == 0) {
                //System.out.println(i);
                count++;
            } else {
                // if (String.valueOf(i).contains("7")) {
                //     //System.out.println(n);
                //     count++;
                // }
                int x = i;
                while(x  != 0) {
                    if (x % 10 == 7) {
                        count++;
                        break;
                    }
                    x /= 10;
                }
            }
        }
        System.out.println(count);
    }
}
