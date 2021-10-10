package com.test.china.springboot0506.test;


import com.test.china.springboot0506.entity.person;

public class ClassFornameDemo {
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("p1");
        System.out.println("p1:"+p1.getName());
        Class c = person.class;
        try {
            person p2 = (person) c.newInstance();
            p2.setName("p2");
            System.out.println("p2:"+p2.getName());
        }catch (Exception e){
            e.printStackTrace();
        }


        try{

//            InfoProperties accessBridge= (InfoProperties) Class.forName("org.springframework.boot.info.InfoProperties").newInstance();
//            System.out.println("name:"+accessBridge.toString());
           Class c1 = Class.forName("com.mysql.jdbc.Driver");
            System.out.println("c:"+c1);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
