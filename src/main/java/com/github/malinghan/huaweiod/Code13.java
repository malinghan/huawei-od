package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        String a = in.nextLine();
        String[] strs = a.split(" ");
        if (strs.length == 1) {
            System.out.println(strs);
            return;
        }
        reverse(strs, 0, strs.length-1);
        String res = "";
        for(String s: strs) {
            res += s + " ";
        }
        res = res.substring(0, res.length()-1);
        System.out.println(res);
        // }
    }

    static void reverse(String[] strs, int l, int r) {
        while(l < r) {
            String s = strs[l];
            strs[l] = strs[r];
            strs[r] = s;
            l++;
            r--;
        }
    }
}
