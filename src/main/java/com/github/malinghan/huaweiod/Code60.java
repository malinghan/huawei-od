package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            solution(a);
        }
    }

    private static void solution(int num) {
        int min = Integer.MAX_VALUE;
        int[] res = new int[2];
        for (int i = 2; i < num; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                if (Math.abs(num - i - i) < min) {
                    res[0] = i;
                    res[1] = num - i;
                    min = Math.abs(num - i - i);
                }
            }
        }
        System.out.println(res[0] + "\n" + res[1]);
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
