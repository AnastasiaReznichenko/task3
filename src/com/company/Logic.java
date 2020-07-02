package com.company;

import java.util.Stack;

public class Logic {
    public static int logic(int a){
        Stack<Integer> st = new Stack<>();
        while (a > 0) {
            st.push(a % 10);
            a /= 10;
        }
        int i = 0;
        while (!st.empty())
            a += st.pop() * Math.pow(10, i++);
        return a;
    }
}
