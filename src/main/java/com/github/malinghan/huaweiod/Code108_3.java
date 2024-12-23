package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code108_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a *b /gcd(a ,  b));
        }
    }

    private static int gcd (int a ,int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
