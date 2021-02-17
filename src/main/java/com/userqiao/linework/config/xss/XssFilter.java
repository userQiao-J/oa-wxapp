package com.userqiao.linework.config.xss;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 创建过滤器，把所有请求对象传入包装类
 * @author：userqiao
 * @email：lihq@op-mobile.com.cn
 * @date：2021/2/17 10:20
 */
@WebFilter(urlPatterns = "/*")
public class XssFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper((HttpServletRequest) servletRequest);
        filterChain.doFilter(xssRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
