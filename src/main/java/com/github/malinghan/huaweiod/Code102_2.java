package com.github.malinghan.huaweiod;

import java.util.*;

public class Code102_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            Map<Character, Integer> map = new TreeMap<>();
            for(char c: a.toCharArray()) {
                map.putIfAbsent(c, 0);
                map.put(c, map.get(c) +1);
            }
            List<Map.Entry> lists = new ArrayList<>(map.entrySet());
            lists.sort((o1, o2) -> {
                if(o1.getValue() != o2.getValue()) {
                    return (int)o2.getValue() - (int)o1.getValue();
                } else {
                    return (int)o1.getKey() - (int)o2.getKey();
                }
            });
            StringBuilder sb = new StringBuilder();
            for(Map.Entry entry: lists) {
                sb.append(entry.getKey());
            }
            System.out.println(sb.toString());
        }
    }
}
