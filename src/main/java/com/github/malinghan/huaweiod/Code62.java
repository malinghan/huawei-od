package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            String binary = Integer.toBinaryString(a);
            int count = 0;
            // for(int i = 0; i < binary.length(); i++) {
            //     if (binary.charAt(i) == '1') {
            //         count++;
            //     }
            // }
            String s = binary.replaceAll("1","");
            System.out.println(binary.length()- s.length());
            //System.out.println(count);
        }
    }
}
