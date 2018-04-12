package com.etoak.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

public class MyDispatcherServlet extends DispatcherServlet {
    //����룺 ��дDispatcherServlet�е�doService������������������ʽ
    @Override
    protected void doService(HttpServletRequest request, 
            HttpServletResponse response)
            throws Exception {
        // TODO Auto-generated method stub

        request.setCharacterEncoding("utf-8");

        super.doService(request, response);
    }
}
