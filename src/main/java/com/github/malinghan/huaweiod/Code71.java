package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            System.out.println(fun(a.toLowerCase(), b.toLowerCase()));
        }
    }

    private static boolean fun(String str1, String str2) {
        if (str1.equals("") && str2.equals("")) {
            return true;
        } else if (str1.equals("") && !str2.equals("")){
            return false;
        } else if (!str1.equals("") && str2.equals("")){
            if (str1.replace("*", "").equals("")) {
                return true;
            } else {
                return false;
            }
        } else {
            int m = str1.length(), n = str2.length();
            if (str1.charAt(m-1) == str2.charAt(n-1) ||
                    (str1.charAt(m-1) == '?' &&
                            (Character.isLetter(str2.charAt(n-1)) ||
                                    Character.isDigit(str2.charAt(n-1))))) {
                return fun(str1.substring(0, m-1), str2.substring(0, n-1));
            } else if (str1.charAt(m-1) == '*') {
                return
                        fun(str1.substring(0, m-1), str2) ||
                                fun(str1, str2.substring(0, n-1));
            } else {
                return false;
            }
        }
    }
}
