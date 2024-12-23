package com.github.malinghan.huaweiod;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Code81_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                String shortstr = in.nextLine();
                String longstr = in.nextLine();
                Set<Character> set = new HashSet<>();
                for (int i = 0; i < shortstr.length(); ++i) {
                    set.add(shortstr.charAt(i));
                }
                for (int i = 0; i < longstr.length(); ++i) {
                    set.remove(longstr.charAt(i));
                }
                System.out.println(set.size() == 0);
            }
        }
}
