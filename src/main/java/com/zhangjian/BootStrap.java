package com.zhangjian;

import com.zhangjian.config.Constant;
import com.zhangjian.config.BootStrapMapping;
import com.zhangjian.config.ServletMappingConfig;
import com.zhangjian.servlet.Request;
import com.zhangjian.servlet.Response;
import com.zhangjian.servlet.Servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 入口
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public final class BootStrap implements BootStrapMapping {

    private HashMap<String,String> servletMapping = new HashMap<String, String>();

    private static  volatile BootStrap bootStrap = null;
    public static void main(String[] args) {

       if (bootStrap == null){
           bootStrap = new BootStrap();
       }

       bootStrap.start();
    }

    @Override
    public void start(){

        init(new ServletMappingConfig("我是配置文件"));

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(Constant.PORT);

            while (true){
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                Request request = new Request(inputStream);
                Response response = new Response(outputStream);
                dispatch(request,response);
                socket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void init(ServletMappingConfig servletMappingConfig) {
        Set<com.zhangjian.model.ServletMapping> servletMappingHashSet = servletMappingConfig.getServletMappingHashSet();
        if (servletMappingHashSet.size()>0){
            Iterator<com.zhangjian.model.ServletMapping> iterator = servletMappingHashSet.iterator();
            while (iterator.hasNext()){
                com.zhangjian.model.ServletMapping entity = iterator.next();
                servletMapping.put(entity.getServletUrl(),entity.getServletClass());
            }
        }
    }

    @Override
    public void dispatch(Request request, Response response) {

        String servletUrl = servletMapping.get(request.getHeader().getUrl());

        try {
            Class<?> aClass = Class.forName(servletUrl);
            Object o = aClass.newInstance();
           ( (Servlet)o).service(request,response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
