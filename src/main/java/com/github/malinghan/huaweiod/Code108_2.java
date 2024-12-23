package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code108_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(gcd (a ,  b, a));
        }
    }

    private static int gcd (int a ,int b, int c) {
        if (a % b == 0) {
            return a;
        }
        return gcd(a + c, b, c);
    }
}
