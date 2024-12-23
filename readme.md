
[题库]
- 华为od
  - https://www.nowcoder.com/ta/huawei
- leetcode
  - https://leetcode-cn.com/problemset/all
- 剑指offer
  - https://github.com/CyC2018/CS-Notes/blob/master/notes/%E5%89%91%E6%8C%87%20Offer%20%E9%A2%98%E8%A7%A3%20-%20%E7%9B%AE%E5%BD%95.md


华为OD 2024最新题库

【刷题题型参考】
1.入门题（5题）

- [x] (1) 输入处理（重要）：HJ5.进制转换
- [x] (2) 排列组合：(牛客搜索)NC61.两数之和
- [x] (3) 快速排序：HJ3.明明的随机数
- [x] (4) 哈希表：HJ10.字符个数统计
- [x] (5) 递归：NC68.跳台阶


（带*题目与第一第二道题目难度相近，以下题目基本覆盖大部分知识点）

2.字符串操作（6题）
- [x] (1) HJ17.坐标移动
- [x] (2) HJ20.密码验证合格程序
- [x] (3) *HJ23.删除字符串中出现次数最少的字符
- [x] (4) *HJ33.整数与IP地址间的转换 【有点难度】
- [x] (5) HJ101.输入整型数组和排序标识
- [x] (6) *HJ106.字符串逆序

3.排序（5题）
- [x] (1) HJ8.合并表记录 -> map排序 -> TreeMap
- [x] (2) *HJ14.字符串排序 -> 字符串排序 -> Arrays.sort
- [x] (3) HJ27. 查找兄弟单词【很复杂，一般人想不出来】
  - 判断2个字符串是否相等，s.toCharArray(),然后放到new int[26]中,然后转成字符串比较是否相等
  - 字符串按字典排序 Collection.sort(list)
- [x] (4) *NC37.合并区间
  - https://leetcode.cn/problems/merge-intervals/
- [x] (5) *HJ68.成绩排序


4.栈（2题）
- [x] (1) NC52.括号序列
  - leetcode 32.最长有效括号
  - leetcode 20. 有效的括号
- [x] (2) *leetcode 1614.括号的最大嵌套深度

5.排列组合（2题）
- [x] (1) *leetcode 面试题08.08.有重复字符串的排列组合
  - https://leetcode.cn/problems/permutation-ii-lcci/description/
- [x] (2) leetcode 77.组合

6.双指针（3题）
- [x] (1) *leetcode 674.最长连续递增序列
- [x] (2) NC17.最长回文子串
  - LeetCode5. 最长回文子串
  - https://leetcode.cn/problems/longest-palindromic-substring/description/
- [x] (3) NC28.最小覆盖子串【HARD】
  - LeetCode76 最小覆盖子串
  - https://leetcode.cn/problems/minimum-window-substring/

```java
// map遍历操作要熟悉
  private  boolean check() {
        Iterator it = tMap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (sMap.getOrDefault(key, 0) < val) {
                 return false;
            }
        }
        return true;
    }
```

7.深搜（1题）
- [x] (1) HJ41.称砝码[HARD]
  - 

8.二叉树（2题）
- [x] (1) *leetcode 剑指offer 32 — II.从上到下打印二叉树II
  - https://www.nowcoder.com/exam/oj/ta?page=1&pageSize=50&search=&tpId=13&type=265
  - Leetcode102 二叉树的层序遍历
    - https://leetcode.cn/problems/binary-tree-level-order-traversal/description/
- [x] (2) leetcode 剑指offer 32 — III.从上到下打印二叉树III
  - Leetcode103 锯齿型遍历二叉树
  - https://github.com/CyC2018/CS-Notes/blob/master/notes/32.3%20%E6%8C%89%E4%B9%8B%E5%AD%97%E5%BD%A2%E9%A1%BA%E5%BA%8F%E6%89%93%E5%8D%B0%E4%BA%8C%E5%8F%89%E6%A0%91.md

9.其他（6题）
- [x] (1) *HJ108.求最小公倍数
- [ ] (2) *HJ28.素数伴侣[HARD] [匈牙利算法，搞不明白]
- [x] (3) *HJ60.查找组成一个偶数最接近的两个素数
- [x] (4) *leetcode 994.腐烂的橘子
- [x] (5) leetcode 204.计数质数
- [x] (6) HJ25. 数据分类处理