package com.github.malinghan.huaweiod;

import java.util.Scanner;


//4舍5入，取整函数： Math.round(a)
public class Code07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        float a = in.nextFloat();
        //求浮点数的整数部分和小数部分
        System.out.println(Math.round(a));
        System.out.println(String.format("%.0f", a));
        // }
    }
}
