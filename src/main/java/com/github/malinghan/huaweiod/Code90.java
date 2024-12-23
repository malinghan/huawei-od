package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code90 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String str = in.next();
            String[] nums = str.split("\\.", -1);
            String result = "YES";

            if(nums.length == 4){

                for(String element : nums) { //遍历每个元素，合不合法

                    if(element.length() == 0 || element.length() > 3){ //每段长度等于0，或者长度大于4，都不合法
                        result = "NO";
                        break;
                    }

                    for(Character ch : element.toCharArray()){ //每段的字符必须是数字
                        if(!Character.isDigit(ch)){
                            result = "NO";
                            break;
                        }
                    }

                    if(element.charAt(0) == '0' && element.length() != 1){ //除0以外，所有0开头的字符串都是非法的
                        result = "NO";
                        break;
                    }



                    if(Integer.parseInt(element) > 255){ //每段对应的数大于255，也是非法的
                        result = "NO";
                        break;
                    }

                }
            }else{
                result = "NO";
            }
            System.out.println(result);
        }

    }
}