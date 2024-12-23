package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        int count = 0;
        if (n < 3) {
            System.out.println(1);
        }
        //1个月
        int a = 1;
        //2个月
        int b = 0;
        //3个月
        int c = 0;
        // f[n] = f0[n] + f1[n] + f2[n] + f3[n]
        for(int i = 2; i <= n; i++) {
            //c批量生产
            c +=  b;
            b = a;
            a = c;
        }
        System.out.println(a+b+c);
    }
}
