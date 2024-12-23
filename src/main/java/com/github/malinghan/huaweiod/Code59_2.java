package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code59_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean exists = false;
        for(int i  = 0; i  < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c);
                exists = true;
            }
        }
        if (!exists) {
            System.out.println(-1);
        }
    }
}
