package com.example.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Arthas
 * @date: 2019-03-13 16:50
 * @description:
 */
public class SetTest {

    public static void main(String[] args) {
        String a = "a";
        String b = new String("a");
        StringBuilder c = new StringBuilder("a");
        Set set = new HashSet();
        set.add(a);
        set.add(b);
        set.add(c);
        System.out.println(set.size());
    }
}