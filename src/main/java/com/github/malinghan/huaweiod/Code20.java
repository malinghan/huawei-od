package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        // 1. 长度超过8
        // 2. 包括：大写字母/小写字母/数字/其它符号，以上四种至少三种
        // 3. 不能分割出两个相等的长度大于 2 的子串，
        // 例如 abcabc 可以分割出两个 abc，不合法，ababa 则无法分割出2个aba。
        while(in.hasNextLine()) {
            String a = in.nextLine();
            if (isValid(a)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    static boolean isValid(String a) {
        boolean isValidFlag = false;
        if (a.length() <= 8) {
            return isValidFlag;
        }
        int a1 = 0, a2 = 0, a3 = 0 , a4 = 0;
        for(char c : a.toCharArray()) {
            if(c >= '0' && c <= '9') {
                a1 = 1;
            } else if(c >= 'a' && c <= 'z') {
                a2 = 1;
            } else if(c >= 'A' && c <= 'Z') {
                a3 = 1;
            } else {
                a4 = 1;
            }
        }
        if (a1 + a2 + a3 + a4 < 3 ) {
            return isValidFlag;
        }

        //字符分割
        for(int  i =3; i < a.length(); i++) {
            if (a.substring(i).contains(a.substring(i-3, i))) {
                return false;
            }
        }

        return true;
    }
}
