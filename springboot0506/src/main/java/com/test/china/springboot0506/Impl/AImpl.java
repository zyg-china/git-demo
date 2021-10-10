package com.test.china.springboot0506.Impl;

import com.test.china.springboot0506.Inter.A;

public class AImpl implements A {
    @Override
    public String getA() {
        return "this is getA";
    }

    @Override
    public String getB() {
        return "this is getB";
    }

    @Override
    public String getD() {
        return "this is getD";
    }
}
