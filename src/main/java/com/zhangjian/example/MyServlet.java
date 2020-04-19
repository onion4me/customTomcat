package com.zhangjian.example;

import com.zhangjian.servlet.HttpServlet;
import com.zhangjian.servlet.Request;
import com.zhangjian.servlet.Response;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/19
 */
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(Request request, Response response) throws Exception{
        response.sendResponse("hello");
    }

    @Override
    public void doPost(Request request, Response response) throws Exception{
        System.out.println(request.getHeader().getParam("username"));
    }

}
