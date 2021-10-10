package com.test.china.springboot0506.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener(value = "ServletContextListener")
public class ListenerDemo implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public ListenerDemo() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("context初始化");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context销毁");
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        String count = "1";
        se.getSession().setAttribute("count",count);
        System.out.println("session创建");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session销毁");
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(ServletContextAttributeEvent sbe) {
        System.out.println("sbe:"+sbe.getValue());
        System.out.println("attribute新增");
    }

    public void attributeRemoved(ServletContextAttributeEvent sbe) {
        System.out.println("attribute删除");
    }

    public void attributeReplaced(ServletContextAttributeEvent sbe) {
        System.out.println("attribute替换");
    }
}
