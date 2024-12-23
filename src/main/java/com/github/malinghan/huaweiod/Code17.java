package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String a = in.nextLine();
        String[] strs = a.split(";");
        int x = 0, y = 0;
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            if (s.length() < 2) {
                continue;
            }
            int num = 0;
            try {
                num = Integer.valueOf(s.substring(1, s.length()));
            } catch (NumberFormatException e) {
                continue;
            }
            // System.out.println(num);
            if(s.charAt(0) == 'A') {
                x -= num;
            } else if(s.charAt(0) == 'W') {
                y += num;
            } else if(s.charAt(0) == 'S') {
                y -= num;
            } if(s.charAt(0) == 'D') {
                x += num;
            }  else {
                continue;
            }
        }
        System.out.println(x + "," + y);
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String a = in.nextLine();
        String[] strs = a.split(";");
        int x = 0, y = 0;
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            if (s.length() < 2) {
                continue;
            }
            if (!s.matches("[WASD][0-9]{1,2}")) {
                continue;
            }
            int num = Integer.parseInt(s.substring(1));
            switch(s.charAt(0)) {
                case 'A':
                    x -= num;
                    break;
                case 'W':
                    y += num;
                    break;
                case 'S':
                    y -= num;
                    break;
                case 'D':
                    x += num;
                    break;
            }
        }
        System.out.println(x + "," + y);
    }
}
