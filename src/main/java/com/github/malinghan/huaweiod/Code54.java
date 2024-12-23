package com.github.malinghan.huaweiod;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Code54 {
    public static void main(String[] args) throws ScriptException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.replace("[", "(");
        s = s.replace("{", "(");
        s = s.replace("}", ")");
        s = s.replace("]", ")");

        ScriptEngine ScriptEngine = new ScriptEngineManager()
                .getEngineByName("rhino");
                //.getEngineByName("nashorn");

        System.out.println(ScriptEngine.eval(s));
    }
}
