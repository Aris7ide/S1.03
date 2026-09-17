package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
        }

    }
}
