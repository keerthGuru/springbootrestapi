package com.keerthi.springbootrestapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListItteratorDemo {
    private static ArrayList al;
    private static ArrayList all;

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        System.out.println("al :" + al);

        System.out.println("=========== for loop===========");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println("=========== for each ===========");

        for (Object obj : al) {
            System.out.println(obj);
        }

        System.out.println("=========== iterator ===========");

        Iterator iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=========== ListIterator ===========");

        ListIterator listIterator = al.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        System.out.println("=========== for each() ===========");
        al.forEach(i -> {
            System.out.println(i);
        });
      /*  List all = new ArrayList();


        all.add(100);
        all.add(200);
        all.add(300);
        all.add(400);
        System.out.println("all :"+ all);
*/
    }

}
