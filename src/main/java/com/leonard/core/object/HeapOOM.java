package com.leonard.core.object;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    public static void main(String[] args) {
        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("开始执行...");
        List list = new ArrayList();
        while (true) {
            list.add(new HeapOOM());
        }
    }

}
