package com.github.malinghan.huaweiod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

/**
 * 判断一个子串是否是回文串：中心扩展法
 * 以i为中心扩展最大的子串
 */
@SpringBootApplication
public class HuaweiOdApplication {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String str = sc.next();
                int count = 1; // 最大回文长度，一个字符也表示回文，长度为1
                for (int i = 0; i < str.length(); i++) {
                    // 情况一：以i为中心，进行两边扩散
                    count = Math.max(count, cal(str, count, i - 1, i + 1));
                    // 情况二：以i,i+1中间空格为中心，进行两边扩散
                    count = Math.max(count, cal(str, count, i, i + 1));
                }
                System.out.println(count);
            }
        }

        // 计算当前下标下左右回文长度
        public static int cal(String str, int count, int left, int right) {
            while (left >= 0 && right < str.length() &&
                    str.charAt(left) == str.charAt(right)) {
                int len = right - left + 1;
                if (len > count) {
                    count = len;
                }
                left--;
                right++;
            }
            return count;
        }
}
