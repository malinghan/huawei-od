package com.github.malinghan.huaweiod;

import java.util.*;

public class Code102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            for(char c: a.toCharArray()) {
                map.putIfAbsent(c, 0);
                map.put(c, map.get(c) +1);
            }
            List<int[]> lists = new ArrayList<>();
            for(char c: map.keySet()) {
                lists.add(new int[]{c,map.get(c)});
            }
            lists.sort((o1, o2) -> {
                if(o1[1] != o2[1]) {
                    return o2[1] - o1[1];
                } else {
                    return o1[0] - o2[0];
                }
            });
            StringBuilder sb = new StringBuilder();
            for(int[] arr: lists) {
                sb.append(((char) (arr[0])) + "");
            }
            System.out.println(sb.toString());
        }
    }
}
