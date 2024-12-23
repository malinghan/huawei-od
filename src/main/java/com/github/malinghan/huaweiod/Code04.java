package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        String a = in.nextLine();
        int l = 0;
        while(l < a.length()) {
            int r = l+8;
            if (r <= a.length()) {
                System.out.println(a.substring(l,r));
            } else {
                String res = a.substring(l,a.length());
                int d = r - a.length();
                for(int i = 0 ; i < d; i ++) {
                    res = res + "0";
                }
                System.out.println(res);
            }
            l = l+8;
        }
        //}
    }
}
