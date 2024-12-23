package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.nextLine();
        char[] arr = s.toCharArray();
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            max = Math.max(max, getLongest(s,i, i));
            max = Math.max(max, getLongest(s,i, i+1));
        }
        System.out.println(max);
    }
    //求字符串中最长的有效回文子串(可以不连续)
    private static int getLongest(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r) ) {
            l--;
            r++;
        }
        return r - l -1;
    }
}
