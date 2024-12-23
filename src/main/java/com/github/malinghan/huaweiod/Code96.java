package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            StringBuilder sb  = new StringBuilder();
            for(int i = 0 ; i < s.length(); i++) {
                if (i == 0 && Character.isDigit(s.charAt(0))) {
                    sb.append("*");
                } else if(i > 0 && !Character.isDigit(s.charAt(i-1)) && Character.isDigit(s.charAt(i))) {
                    sb.append("*");
                }
                sb.append(s.charAt(i));
                if(i == s.length() -1  && Character.isDigit(s.charAt(i))) {
                    sb.append("*");
                } else if(i < s.length() -1  && !Character.isDigit(s.charAt(i+1)) && Character.isDigit(s.charAt(i))) {
                    sb.append("*");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
