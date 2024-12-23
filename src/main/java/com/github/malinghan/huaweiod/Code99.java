package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code99 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            for (int i = 0; i <= n; i++) {
                String str = String.valueOf(i*i);
                String s = String.valueOf(i);
                if (str.endsWith(s)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
