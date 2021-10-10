package com.test.china.springboot0506;

import com.test.china.springboot0506.entity.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class test6 {
    public static void main(String[] args) {

        String filePath = "qqqq";
        int hashCodeSHA1=filePath.hashCode();

        System.out.println("hashcode:"+hashCodeSHA1);
        List<person> a = new ArrayList();
        List<person> c = new ArrayList();
        List b = new ArrayList();
        person p  = new person();
        p.setName("name");
        p.setId("id");
//        a.add("aaa");
//        a.add("bbb");
//        a.add("ccc");
        a.add(p);
//a= null;
//        b = a.stream().collect(Collectors.toList());
//        b = a.stream().anyMatch(k ->k.equals("fff"));
        b = a.stream().filter(k -> k.getId()=="111").collect(Collectors.toList());
        System.out.println("b:"+b);
    }
}
