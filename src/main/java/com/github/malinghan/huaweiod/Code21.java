package com.github.malinghan.huaweiod;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Code21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        Map<String,String> map = new HashMap<>();
        map.put("1", "1");
        map.put("abc", "2");
        map.put("def", "3");
        map.put("ghi", "4");
        map.put("jkl", "5");
        map.put("mno", "6");
        map.put("pqrs", "7");
        map.put("tuv", "8");
        map.put("wxyz", "9");
        map.put("0", "0");
        StringBuffer sb = new StringBuffer();
        for(char c : chars) {
            if (c >= 'A' && c <= 'Y') {
                char x = (char) ((c - 'A' +1 ) + 'a');
                sb.append(String.valueOf(x));
            } else if (c == 'Z') {
                sb.append("a");
            } else if (c >= 'a' && c <= 'z') {
                Set<String> keys = map.keySet();
                for(String k : keys) {
                    if (k.contains(String.valueOf(c))) {
                        sb.append(map.get(k));
                    }
                }
            } else if (c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
