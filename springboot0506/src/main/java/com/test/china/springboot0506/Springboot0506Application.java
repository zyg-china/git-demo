package com.test.china.springboot0506;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.test.china.springboot0506.entity.RequestDemo;
import com.test.china.springboot0506.entity.User;
import com.test.china.springboot0506.entity.person;
import com.test.china.springboot0506.listener.ListenerDemo;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@ServletComponentScan

public class Springboot0506Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0506Application.class, args);
    }

    @RequestMapping("/test")
    public String add (Model model, HttpServletRequest request, HttpServletResponse response){
        User user1 = User.builder().id("1").name("n1").password("p1").build();
        User user2 = new User();
        BeanUtils.copyProperties(user1,user2);

        user2.getId();

        String m = "dd";
//        makeS(user2);
        System.out.println("user2:"+user2);
        return "test";
    }
    public static void makeS(User param){



        Class paramClass = param.getClass();
        Field[] fields = paramClass.getDeclaredFields();
        Method[] methods = paramClass.getMethods();

                Method method2;
                try {
                     method2 = paramClass.getDeclaredMethod("setId", String.class);
                    method2.invoke(String.class,"345");
                }catch (Exception e){

                }

            }

   @PostMapping("/test2")
    public String add2 (@RequestBody RequestDemo requestDemo){

        return "test";
    }



}
