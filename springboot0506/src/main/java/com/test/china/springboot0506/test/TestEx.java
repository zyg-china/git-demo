package com.test.china.springboot0506.test;

public class TestEx {
    public static void main(String[] args) {
        Fa fa = new Sa();
        fa.IsFa();
        ((Sa) fa).IsSa();
        ((Sa) fa).aa();
        Sa sa = new Sa();
        sa.IsSa();
        sa.IsFa();

    }
}
