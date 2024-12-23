package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            int l  =0;
            int n = a.length();
            char[] chars = a.toCharArray();
            reverse(chars, 0 , n-1);
            System.out.println(String.valueOf(chars));
        }
    }

    static void reverse(char[] chars, int l , int r) {
        while(l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
    }
}
