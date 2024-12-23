package com.github.malinghan.huaweiod;

import java.util.Scanner;
import java.util.*;

public class Code26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.nextLine();
        int  n = s.length();
        List<Character> characters = new ArrayList<>();
        for(int  i = 0 ; i < n; i++) {
            if(Character.isLetter(s.charAt(i))) {
                characters.add(s.charAt(i));
            }
        }
        characters.sort(Comparator.comparingInt(Character::toLowerCase));
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0, j = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                sb.append(characters.get(j++));
            } else {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
