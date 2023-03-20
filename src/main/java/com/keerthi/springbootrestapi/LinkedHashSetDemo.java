package com.keerthi.springbootrestapi;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(1);
        lhs.add(3);
        lhs.add(1);
        lhs.add(null);
        lhs.add(7);

        System.out.println(lhs);

    }
}
