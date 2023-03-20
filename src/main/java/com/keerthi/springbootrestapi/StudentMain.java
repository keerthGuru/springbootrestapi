package com.keerthi.springbootrestapi;

import java.util.LinkedList;

public class StudentMain {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(100);
        ll.add(600);
        ll.add(null);
        System.out.println(ll);
        System.out.println(ll.get(4));
        ll.add(4, 401);
        System.out.println(ll);

        System.out.println(ll.getLast());
        System.out.println(ll.get(4));

    }}




