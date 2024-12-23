package com.github.malinghan.huaweiod;

import java.util.Scanner;
import java.util.TreeSet;

public class Code80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < m; i++) {
                set.add(sc.nextInt());
            }
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            for (int i : set) {
                System.out.print(i);
            }
        }
        sc.close();
    }
}
