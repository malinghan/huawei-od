package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code06 {
    //质数分解,不断整除
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        int a = in.nextInt();
        for(int i = 2; i <= Math.sqrt(a);i++) {
            while (a % i == 0) {
                a = a / i;
                System.out.print(i + " ");
            }
        }
        if (a != 1) {
            System.out.print(a);
        }
    }
}
