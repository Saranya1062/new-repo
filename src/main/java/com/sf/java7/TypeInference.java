package com.sf.java7;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();   //java 6 and below 6 versions
        list.add(12);
        for (Integer element : list) {
            System.out.println(element);
        }

        List<Integer> list1 = new ArrayList<>();  //jaava 7
        list1.add(120);
        list1.add(23);
        for (Integer element : list1) {
            System.out.println(element);
        }
    }
}
