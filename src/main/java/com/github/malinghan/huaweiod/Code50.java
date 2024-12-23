package com.github.malinghan.huaweiod;

import java.util.LinkedList;
import java.util.Scanner;

public class Code50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        String s = in.nextLine();
        LinkedList<Integer> stack = new LinkedList<>();
        int n = s.length();
        int num1 = 0;
        int num2 = 1;
        int o1 = 1;
        int o2 = 1;
        for(int i = 0; i < n;i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                int curr = 0;
                while(i < n && Character.isDigit(s.charAt(i))) {
                    curr = curr * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                num2 = o2 == 1 ? num2 * curr : num2 / curr;
            } else if (c == '*' || c == '/') {
                o2 = c == '*' ? 1 : -1;
            } else if (c == '(' || c == '{'
                    || c == '[') {
                stack.push(num1);
                stack.push(o1);
                stack.push(num2);
                stack.push(o2);

                num1 = 0;
                num2 = 1;
                o1 = 1;
                o2 = 1;
            } else if (c == '+' || c == '-') {
                if(c=='-' &&
                        (i==0
                                || s.charAt(i-1)=='('
                                || s.charAt(i-1)=='['
                                || s.charAt(i-1)=='{')){
                    o1 = -1;
                    continue;
                }
                num1 = num1 + o1 * num2;
                o1 = (c == '+' ? 1 : -1);
                num2 = 1;
                o2 = 1;
            } else {
                int curr = num1 + o1 * num2;
                o2 = stack.pop();
                num2 = stack.pop();
                o1 = stack.pop();
                num1 = stack.pop();
                num2 = o2 == 1 ? num2 * curr : num2 / curr;
            }
        }
        System.out.println(num1 + o1 * num2);
        //}
    }
}
