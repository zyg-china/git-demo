package com.test.china.springboot0506;

import com.test.china.springboot0506.Impl.BImpl;
import com.test.china.springboot0506.Inter.B;

public class test3 {
    public static void main(String[] args) {
        B b = new BImpl();
        System.out.println("ok:"+b.getB_A());
        b.getB_A();
    }
}
