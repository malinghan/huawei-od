package com.github.malinghan.huaweiod;

import java.util.*;

public class Code89_2 {
    private static Map<String, Integer> map = new HashMap<String, Integer>(){{
        put("2", 2);put("3", 3);put("4", 4);put("5", 5);
        put("6", 6);put("7", 7);put("8", 8);put("9", 9);
        put("10", 10);put("J", 11);put("Q", 12);put("K", 13);
        put("A", 1);
    }};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] input = a.split(" ");
        if(a.contains("joker") || a.contains("JOKER")){
            System.out.println("ERROR");
        }else{
            if(!dfs(input, 0, 0, "")){
                System.out.println("NONE");
            }
        }
    }
    static boolean[] visited = new boolean[4];
    private static boolean dfs(String[] arr,
                               int i,
                               int total,
                               String exp) {        //因为可以乱序
        for(int k = 0; k < arr.length; k++) {
            String temp = arr[k];
            if (visited[k]) {
                continue;
            }
            visited[k] = true;
            // if (temp.equals("")) {
            //     continue;
            // }
            // arr[k] = "";
            int a = map.get(temp);
            if (i == 0) {
                if(dfs(arr, i+1, a, exp + temp)) {
                    return true;
                }
            } else {
                if(dfs(arr, i+1,total + a, exp + "+" + temp) ||
                        dfs(arr, i+1,total - a, exp + "-" + temp) ||
                        dfs(arr, i+1,total * a, exp + "*" + temp) ||
                        dfs(arr, i+1,total / a, exp + "/" + temp)) {
                    return true;
                }
            }
            visited[k] = false;
            //arr[k] = temp;
        }
        if (total == 24 && i == arr.length) {
            System.out.println(exp);
            return true;
        }
        return false;
    }
}
