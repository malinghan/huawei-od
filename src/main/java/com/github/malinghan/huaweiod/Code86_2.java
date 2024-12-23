package com.github.malinghan.huaweiod;

import java.util.Scanner;

/**
 * 符号右移
 */
public class Code86_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while(in.hasNextInt()){
                int num = in.nextInt();
                int max = 0;
                int count = 0;
                while(num != 0){
                    if((num&1) == 1){
                        count++;
                        max = Math.max(max,count);
                    }
                    else{
                        count = 0;
                    }
                    num >>>= 1;
                }
                System.out.println(max);
            }
        }
}
