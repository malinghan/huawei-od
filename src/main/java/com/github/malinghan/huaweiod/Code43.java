package com.github.malinghan.huaweiod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] map = new int[n][m];
            //DFS给出路径
            for(int  i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    map[i][j] = in.nextInt();
                }
            }
            List<String> path = new ArrayList<>();
            dfs(map, 0, 0, path);
            for(String s : path) {
                System.out.println(s);
            }
        }
    }

    private static boolean  dfs(int[][] map,
                                int x,
                                int y,
                                List<String> path) {
        path.add("("+ x+","+ y +")");
        map[x][y] = 1;
        if (x == map.length -1 && y == map[0].length -1) {
            return true;
        }
        if (x +1 <map.length && map[x+1][y] == 0) {
            if (dfs(map, x+1, y , path)) {
                return true;
            }
        }
        if (y +1 <map[0].length && map[x][y+1] == 0) {
            if (dfs(map, x, y+1, path)) {
                return true;
            }
        }
        if (x -1 >= 0 && map[x-1][y] == 0) {
            if (dfs(map, x-1, y , path)) {
                return true;
            }
        }
        if (y -1 >= 0 && map[x][y-1] == 0) {
            if (dfs(map, x, y-1, path)) {
                return true;
            }
        }
        //回溯
        path.remove(path.size() - 1);
        map[x][y] = 0;
        return false;
    }
}
