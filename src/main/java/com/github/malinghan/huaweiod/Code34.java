package com.github.malinghan.huaweiod;

import java.util.Arrays;
import java.util.Scanner;

public class Code34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.nextLine();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(String.valueOf(c));
    }
}
