package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
    static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        Iterator<Integer> iterator = list1.iterator();

        List<Integer> list2 = new ArrayList<>();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            list2.add(i);
        }

        Collections.reverse(list2);

        for (Integer i : list2) {
            System.out.println(i);
        }

    }
}
