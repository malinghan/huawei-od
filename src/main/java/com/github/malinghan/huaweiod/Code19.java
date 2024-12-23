package com.github.malinghan.huaweiod;

import java.util.*;

public class Code19 {
    public  static class ErrorInfo {
        public String code;
        public String line;
        public Integer count;

        public ErrorInfo(){}

        public ErrorInfo(String code , String line, Integer count){
            this.code = code;
            this.line = line;
            this.count = count;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        List<String> list = new LinkedList<>();
        Map<String, ErrorInfo> map = new HashMap<>();
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            String[] strs = s.split(" ");
            String filePath = strs[0];
            String line = strs[1];
            String postfix = filePath.substring(filePath.lastIndexOf("\\")+1);
            if (postfix.length() > 16) {
                postfix = postfix.substring(postfix.length() - 16);
            }
            String uniCode = postfix + "-" + line;
            if (map.containsKey(uniCode)) {
                ErrorInfo errorInfo = map.get(uniCode);
                errorInfo.count += 1;
            } else {
                ErrorInfo errorInfo = new  ErrorInfo(postfix,line, 1);
                map.put(uniCode,errorInfo);
                if (list.size() >= 8) {
                    list.remove(0);
                }
                list.add(uniCode);
            }
        }
        for(String post: list) {
            ErrorInfo err = map.get(post);
            System.out.println(err.code + " " + err.line + " " + err.count);
        }

        //1. 文件名称和行号,最多8条错误记录。循环记录。
        //2. 只输出最后8条错误记录。
        // 3. 相同错误记录只记录一条,错误计数累加，
        //4. 最后\后面的后缀的后16位相同和行号，匹配才算相同。
        //5. 只记录文件的最后有效16个字符
        //6. 它们的名字的后16个字符相同,也是相同的错误记录。
        //7. 记录文件名称不能带路径,如果它们的名字的后16个字符相同，也被视为相同的错误记录
        //8. 以第一次出现的顺序为准
    }
}
