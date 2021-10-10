package com.test.china.springboot0506.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "DAFilter2",urlPatterns = "/*",
        initParams = {@WebInitParam(name = "key",value = "password")})
public class AFilter2 implements Filter {

    String key;
    public void destroy() {
        System.out.println("执行了destory方法。。。。。");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("进入AdoFilter2方法。。。。");
        System.out.println("Areq2:"+req);
        System.out.println("Aresp2:"+resp);
        System.out.println("Achain2:"+chain);
        System.out.println("Akey:"+key);
        System.out.println("req:"+req);
        System.out.println("resp:"+resp);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        key = config.getInitParameter("key");
        key = "Apassowrd2222";
        System.out.println("Afilter2 init ");
    }

}
