package com.etoak.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

public class MyDispatcherServlet extends DispatcherServlet {
    //软编码： 重写DispatcherServlet中的doService方法来控制请求编码格式
    @Override
    protected void doService(HttpServletRequest request, 
            HttpServletResponse response)
            throws Exception {
        // TODO Auto-generated method stub

        request.setCharacterEncoding("utf-8");

        super.doService(request, response);
    }
}
