package com.test.china.springboot0506.test;

public class Sa extends Fa {

    String Sa;

    public Sa() {
    }

    public Sa(String sa) {
        Sa = sa;
    }

    public Sa(String name, String fa, String sa) {
        super(name, fa);
        Sa = sa;
    }

    public String getSa() {
        return Sa;
    }

    public void setSa(String sa) {
        Sa = sa;
    }

    public void IsSa(){
        System.out.println("this is Sa");
    }
    public void aa(){
        System.out.println("this is aaa");
    }
}
