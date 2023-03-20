package com.keerthi.springbootrestapi;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack st  = new Stack();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println(st.get(2));
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
st.remove(3);
        System.out.println(st);
    }
}
