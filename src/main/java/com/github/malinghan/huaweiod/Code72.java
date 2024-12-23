package com.github.malinghan.huaweiod;

import java.util.Scanner;

/**
 * 注意整除
 */
public class Code72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        int a = in.nextInt();
        int n = 100;
        for(int i = 0; i <= n / 5; i++) {
            for(int j = 0; 3 * j <= n - 5 * i; j++) {
                int k = n - i - j;
                if (15 * i + 9 * j  + k  == 3 * n) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        // }
    }
}
