package com.test.china.springboot0506.Inter;

public interface B {
    A getA();

    default String getB_A(){
        return getA().getA();
    };

    default String getB_B(){
        return getA().getB();
    };

    default String getB_D(){
        return getA().getD();
    };
    default String getB_C(){
        return "this is B-C";
    };
}
