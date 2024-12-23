package com.github.malinghan.huaweiod;

import java.util.Arrays;
import java.util.Scanner;

public class Code45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        for(int i = 0; i < n ; i ++) {
            String s = in.next();
            //System.out.println(s);
            System.out.println(getNum(s));
        }
    }

    private static int getNum(String s) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()) {
            arr[c - 'a'] += 1;
        }
        Arrays.sort(arr);
        int num = 0;
        int p = 26;
        for(int i = 25; i >= 0; i--) {
            if (arr[i] != 0) {
                num += arr[i] * p;
                p--;
            }
        }
        return num;
    }
}
