package com.keerthi.springbootrestapi;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List ar = new ArrayList();
        ar.add(400);
        ar.add(200);
//        ar.add(300);
//        ar.add(400);
//        ar.add(700);

        List<Integer> ar1 = new ArrayList<Integer>();

        ar1.add(100);
        ar1.add(300);
        ar1.add(700);
        ar1.add(800);
        ar1.add(700);
        ar1.add(Integer.valueOf("jui"));
        System.out.println("ar1:" + ar1);
        System.out.println("ar:" + ar);

      //  ar1.retainAll(ar);

        System.out.println("ar1:" + ar1);
        System.out.println("ar:" + ar);

       /* System.out.println("ar1:" + ar1);

        System.out.println(ar1.addAll(ar));
        System.out.println("ar1:" + ar1);

        System.out.println("ar:" + ar);
        ar.add(1, 20);
        System.out.println("ar:" + ar);
        ar.set(1, 200);
        System.out.println("ar:" + ar);
        System.out.println(ar.contains(200));
        System.out.println(ar.get(4));
        System.out.println(ar.indexOf(200));
        System.out.println(ar.indexOf(220));
        System.out.println(ar.lastIndexOf(200));*/

//        ar.clear();
//        System.out.println("ar1:" + ar1);
//        System.out.println("ar:" + ar);
//        ar1.isEmpty();

//        System.out.println("ar1:"+ar1);
//        System.out.println("remove  :"+ar.remove(3));
//        System.out.println("remove  :"+ar.remove(ar1));
        //  System.out.println("remove  :"+ar.get(2));


    }

}
