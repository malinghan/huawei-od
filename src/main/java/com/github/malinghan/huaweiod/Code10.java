package com.github.malinghan.huaweiod;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Code10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        String a = in.nextLine();
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i  < a.length(); i++) {
            // if (!set.contains(a.charAt(i))) {
            set.add(a.charAt(i));
            // }
        }
       //System.out.println(set.size());
        System.out.println(a.chars().distinct().count());
        // }
    }
}
