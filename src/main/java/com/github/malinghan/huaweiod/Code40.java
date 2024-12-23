package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            for(char c: s.toCharArray()) {
                if (Character.isLetter(c)) {
                    count1++;
                }
                else if (c == ' ') {
                    count2++;
                }
                else if (c >= '0' && c <= '9') {
                    count3++;
                } else {
                    count4++;
                }
            }
            System.out.println(count1++);
            System.out.println(count2++);
            System.out.println(count3++);
            System.out.println(count4++);
        }
    }
}
