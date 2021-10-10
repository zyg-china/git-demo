package com.test.china.springboot0506.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "DemoFilter",urlPatterns = "/*")
public class DemoFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("进入doFilter方法。。。。");
        System.out.println("req:"+req);
        System.out.println("resp:"+resp);
        System.out.println("chain:"+chain);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filter init ");
    }

}
