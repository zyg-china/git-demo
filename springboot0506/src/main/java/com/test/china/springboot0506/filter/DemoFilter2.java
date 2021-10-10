package com.test.china.springboot0506.filter;

import com.test.china.springboot0506.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "DemoFilter2",urlPatterns = "/*",
        initParams = {@WebInitParam(name = "key",value = "password")})
public class DemoFilter2 implements Filter {

    String key;
    public void destroy() {
        System.out.println("执行了destory方法。。。。。");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("进入doFilter2方法。。。。");
        System.out.println("req2:"+req);
        System.out.println("resp2:"+resp);
        System.out.println("chain2:"+chain);
        System.out.println("key:"+key);
        User user = new User();

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        key = config.getInitParameter("key");
        key = "passowrd2222";
        System.out.println("filter2 init ");
    }

}
