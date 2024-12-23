package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int temp = a;
            a = a < b ? a : b;
            b = temp < b ? b : temp;
            for(int i = 1; i  <=  a; i ++) {
                if ((b * i) % a == 0) {
                    System.out.println(i * b);
                    break;
                }
            }
        }
    }
}
