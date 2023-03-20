package com.keerthi.springbootrestapi;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
      //  System.out.println(v);
      //  System.out.println(v.get(2));
        Enumeration elements = v.elements();

        System.out.println( elements.nextElement().equals(20));

     /*   Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

    }
}
