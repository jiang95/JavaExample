package com.example.common.map;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author: lingjun.jlj
 * @date: 2018-11-22 23:10
 * @description: hashmap 出现死循环
 */
public class HashMapDeadCase {

    public static void main(String[] args) throws InterruptedException {
        final HashMap<String, String> map = new HashMap<>(2);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                new Thread(() -> map.put(UUID.randomUUID().toString(), "  "), "ftf" + i).start();
            }
        }, "ftf");
        t.start();
        t.join();
    }
}
