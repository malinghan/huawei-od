package com.github.malinghan.huaweiod;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Code59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextLine()) { // 注意 while 处理多个 case
        String s = in.nextLine();
        LinkedHashMap<Character,Integer> map  = new
                LinkedHashMap<>();
        boolean exist = false;
        for( char c: s.toCharArray()) {
            map.put(c, map.get(c) != null ? map.get(c) +1 : 1);
        }
        for(Character cc : map.keySet()) {
            if (map.get(cc) == 1) {
                exist = true;
                System.out.println(cc);
                break;
            }
        }
        if (!exist) {
            System.out.println(-1);
        }
    }
}
