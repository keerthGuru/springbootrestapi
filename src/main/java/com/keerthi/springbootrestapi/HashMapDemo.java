package com.keerthi.springbootrestapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map =  new HashMap<>();

        map.put(1,"mee");
        map.put(2,"see");
        map.put(3,"dee");
        map.put(4,"fee");
        map.put(4,"eee");
        System.out.println(map);
       /* System.out.println("Map size: " +map.size());
        System.out.println(" check whether contain or not : " +map.containsKey(1));
        System.out.println(" check whether contain or not : " +map.containsKey(6));
        System.out.println(map.isEmpty());
        System.out.println(map.put(5,"iee"));*/
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
/*

        for (Integer key:map.keySet()) {
            System.out.print(key+ " - ");
            System.out.println(map.get(key));
        }

        System.out.println(map .get(1));
        System.out.println(map .get(8));
        Collection<String> values = map.values();
        for (String v: values       ) {
            System.out.println(v);
        }

*/

    }
}
