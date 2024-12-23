package com.github.malinghan.huaweiod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code43_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            path.clear();
            best_path.clear();//每个用例之前，都要清空下路径
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] map = new int[n][m];
            //DFS给出路径
            for (int  i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = in.nextInt();
                }
            }
            List<String> path = new ArrayList<>();
            dfs(map, 0, 0);
            for (String s : best_path) {
                System.out.println(s);
            }
        }
    }

    public static ArrayList<String> path = new ArrayList<>();//搜索所有可能的路径
    public static ArrayList<String> best_path = new ArrayList<>();//最短路径

    private static void  dfs(int[][] map,
                             int x,
                             int y) {
        //越界
        if (x < 0 || x > map.length - 1 ||
                y < 0 || y > map[0].length - 1) {
            return;
        }
        //撞墙
        if (map[x][y] == 1) {
            return;
        }
        //找到终止条件
        if (x == map.length - 1 && y == map[0].length - 1) {
            path.add("(" + x + "," + y + ")");
            if(best_path.size() == 0
                    || path.size() < best_path.size()) {
                best_path.clear();
                for(String s: path) {
                    best_path.add(s);
                }
            }
            return;
        }
        map[x][y] = 1;//标记走过的点
        path.add("(" + x + "," + y + ")"); //添加到路径中
        dfs(map, x - 1, y);
        dfs(map, x + 1, y);
        dfs(map, x, y - 1);
        dfs(map, x, y + 1); //以i j为中心，上下左右搜索
        map[x][y] = 0; //回溯
        path.remove(path.size() - 1);
    }
}
