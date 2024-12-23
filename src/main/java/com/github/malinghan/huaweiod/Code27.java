package com.github.malinghan.huaweiod;

import java.util.*;

public class Code27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        String kkk = in.next();
        int k = in.nextInt();
        List<String> lists = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i].length() != kkk.length() ||
                    kkk.equals(arr[i])) {
                continue;
            }
            char[] s = arr[i].toCharArray();
            char[] j = kkk.toCharArray();

            Arrays.sort(s);
            Arrays.sort(j);
            if (new String(s).equals(new String(j))) {
                lists.add(arr[i]);
            }
        }
        int count = lists.size();
        System.out.println(count);
        if (count >= k) {
            Collections.sort(lists);
            System.out.println(lists.get(k-1));
        }
    }
}
