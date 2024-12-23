package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code31 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String test = sc.nextLine();

            char[] ch = test.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < ch.length; i++) {
                if (Character.isLetter(ch[i])) {
                    sb.append(ch[i]);
                } else {
                    sb.append(" ");
                }
            }
            String[] arr = sb.toString().split(" ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
}
