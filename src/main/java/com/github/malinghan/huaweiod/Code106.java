package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String res = reverse(str);
            System.out.println(res);
        }
    }

    private static String reverse(String str) {
        StringBuilder res = new StringBuilder(str);
        return res.reverse().toString();
    }
}
