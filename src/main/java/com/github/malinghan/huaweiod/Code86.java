package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String binary = Integer.toBinaryString(a);
        boolean flag = false;
        int max = 0;
        int  i = 0;
        while(i < binary.length()) {
            if (binary.charAt(i) == '1') {
                int count = 0;
                while(i < binary.length() && binary.charAt(i) == '1') {
                    count++;
                    i++;
                }
                if (max < count) {
                    max = count;
                }
            } else {
                i++;
            }
        }
        System.out.println(max);
    }
}
