package com.test.china.springboot0506;

import java.util.HashMap;
import java.util.Map;

public class Test4 {

    public static void main(String[] args) {
        Map<String,Object> context = new HashMap<>();
        System.out.println("context1:"+context.get("forward"));
        Test5 t5 = new Test5();
        t5.get(context);

        System.out.println("context2:"+context.get("forward"));
        context.put("forward","123");
        System.out.println("context3:"+context.get("forward"));
        Map map = new HashMap();
        map.put("rollback","rll2");
        context.put("forward",new HashMap<>().put("rollback","rool"));
        context.put("forward",map);
        System.out.println("contextAll:"+context);
        System.out.println("context4:"+context.get("forward"));
        context.put("forward","456");
        System.out.println("context5:"+context.get("forward"));

    }
}
