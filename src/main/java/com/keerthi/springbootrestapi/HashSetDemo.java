package com.keerthi.springbootrestapi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet s= new HashSet();
        s.add(1);
        s.add(1);
        System.out.println(s);

        HashSet<StudentDemo> hs = new HashSet<>();
        hs.add(new StudentDemo(1,"kee"));
        hs.add(new StudentDemo(3,"see"));
        hs.add(new StudentDemo(5,"kee"));
        hs.add(new StudentDemo(5,"pee"));
        hs.add(new StudentDemo(5,"pee"));
        System.out.println(hs);
        Iterator<StudentDemo> iterator = hs.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
    }}
}
