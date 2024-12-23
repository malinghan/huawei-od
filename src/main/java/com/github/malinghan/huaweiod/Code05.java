package com.github.malinghan.huaweiod;

import java.util.Scanner;

//进制转换
public class Code05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        // while (in.hasNextInt()) { // 注意 while 处理多个 case
        String a = in.nextLine();
        int res = 0;
        for(int i = 2; i < a.length(); i++) {
            char x = a.charAt(i);
            if (x == 'A') {
                res = res * 16 + 10;
            } else if (x == 'B') {
                res = res * 16 + 11;
            } else if (x == 'C') {
                res = res * 16 + 12;
            } else if (x == 'D') {
                res = res * 16 + 13;
            } else if (x == 'E') {
                res = res * 16 + 14;
            } else if (x == 'F') {
                res = res * 16 + 15;
            } else {
                int num = x - '0';
                res = res * 16 + num;
            }
        }
        System.out.println(res);
    }
}
