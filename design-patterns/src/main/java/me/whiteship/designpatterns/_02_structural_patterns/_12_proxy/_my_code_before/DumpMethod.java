package me.whiteship.designpatterns._02_structural_patterns._12_proxy._my_code_before;

import java.lang.reflect.Method;

public class DumpMethod {
    public static void main(String args[]) {
        try {
            Class c = Class.forName(args[0]);
            Method[] m = c.getDeclaredMethods();
            for (int i=0; i<m.length; i++) {
                System.out.println(m[i].toString());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
