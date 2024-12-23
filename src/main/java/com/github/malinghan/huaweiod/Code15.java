package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int count = 0;
            String str = Integer.toBinaryString(a);
            int len  = str.length();
            String newStr = str.replaceAll("1", "");
            System.out.println(len - newStr.length());
        }
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int a = in.nextInt();
//            int count = 0;
//            while(a != 0) {
//                if (a % 2  == 1) {
//                    count ++;
//                }
//                a /= 2;
//            }
//            System.out.println(count);
//        }
//    }
}
