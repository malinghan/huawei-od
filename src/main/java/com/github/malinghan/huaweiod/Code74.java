package com.github.malinghan.huaweiod;

import java.util.ArrayList;
import java.util.Scanner;

public class Code74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        int y = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '"') {
                //第一个引号
                y++;
            } else if (c == ' ' &&  y % 2 == 0) { //为空格，且没有引号
                list.add(sb.toString());
                sb = new StringBuilder(); //置空，重新遍历下一个字符
            } else {
                //有空格、有引号
                sb.append(c);
            }
        }
        list.add(sb.toString());
        System.out.println(list.size());
        for(String s1 : list) {
            System.out.println(s1);
        }
    }
}
