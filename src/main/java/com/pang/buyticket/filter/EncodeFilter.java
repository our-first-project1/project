package com.pang.buyticket.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//编码级过滤器
//urlPatterns  当前过滤器Filter对哪一些请求做处理
//initParams   当前过滤器的初始化参数
@WebFilter(filterName = "f1" , urlPatterns = "/*")
public class EncodeFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        request.setCharacterEncoding("utf-8");

        //resp.setContentType("text/html;charset=utf-8");
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
