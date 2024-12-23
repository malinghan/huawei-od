package com.github.malinghan.huaweiod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区
        String key = in.nextLine();
        String plain = in.nextLine();
        char[] keys = key.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c: keys) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }
        for(int i = 0; i < 26; i ++) {
            char c  = (char)('a' + i);
            if(!list.contains(c)) {
                list.add(c);
            }
        }
        char[] code = new char[plain.length()];
        for(int i = 0 ; i < plain.length(); i++) {
            code[i] = list.get(plain.charAt(i) - 'a');
        }
        System.out.println(new String(code));
    }
}
