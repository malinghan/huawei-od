package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.nextLine();
        int[] arr = new int[26];
        for(char c: s.toCharArray()) {
            arr[c - 'a']++;
        }
        int min_count = 21;
        for(int i = 0; i < 26;i++) {
            if(arr[i] > 0) {
                min_count = Math.min(min_count, arr[i]);
            }
        }
        // Set<Character> cc = new HashSet<>();
        // for(int i = 0; i < 26;i++) {
        //     if(arr[i] == min_count) {
        //         cc.add( (char)(i + 'a'));
        //     }
        // }
        // for(Character ccc : cc) {
        //     s = s.replaceAll(ccc+"", "");
        // }
        for(int i = 0; i < 26;i++) {
            if(arr[i] == min_count) {
                s = s.replaceAll((char)(i + 'a')+"", "");
            }
        }
        System.out.println(s);
    }
}
