package com.github.malinghan.huaweiod;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 描述
 * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是 0 。
 *
 * 数据范围：
 * 1≤n≤10
 * 8
 *
 * 输入描述：
 * 输入一个int型整数
 *
 * 输出描述：
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class Code09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        int a = in.nextInt();
        String res = "";
        Set<Integer> exists = new HashSet<>();
        while(a != 0) {
            int  num = a % 10;
            if (!exists.contains(num)) {
                exists.add(num);
                res = res + num;
            }
            a /= 10;
        }
        System.out.println(res);
    }
}
