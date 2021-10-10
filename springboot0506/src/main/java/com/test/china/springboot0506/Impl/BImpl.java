package com.test.china.springboot0506.Impl;

import com.test.china.springboot0506.Inter.A;
import com.test.china.springboot0506.Inter.B;

public class BImpl implements B {
    @Override
    public A getA() {
        return new AImpl();
    }

    @Override
    public String getB_A() {
        return getA().getA();
    }

    @Override
    public String getB_B() {
        return getA().getB();
    }

    @Override
    public String getB_D() {
        return null;
    }

    @Override
    public String getB_C() {
        return null;
    }
}
