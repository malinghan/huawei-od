package com.github.malinghan.huaweiod;

import java.util.*;

public class Code70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区
        int n = in.nextInt();
        int[][] count = new int[n][2];
        for (int i = 0; i < n; i++) {
            count[i][0] = in.nextInt();
            count[i][1] = in.nextInt();
        }
        String s = in.next();
        // System.out.println(s);
        int res = 0;
        //括号匹配算法
        LinkedList<int[]> stack = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                //出栈
                int[] arr2 = stack.pop();
                int[] arr1 = stack.pop();
                res += arr1[0] * arr1[1] * arr2[1];
                int[] arr3 = new int[2];
                arr3[0] = arr1[0];
                arr3[1] = arr2[1];
                stack.push(arr3);
            } else if (s.charAt(i) == '(') {

            } else {
                //入栈
                stack.push(count[s.charAt(i) - 'A']);
            }
        }
        System.out.println(res);
    }
}
