package com.test.china.springboot0506.test;

public class Fa {
    String name;

    String fa;

    public Fa() {

    }


    public Fa(String name, String fa) {
        this.name = name;
        this.fa = fa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public void IsFa(){
        System.out.println("this is IsFa");
    }
}
