package com.zhangjian.servlet;

import com.zhangjian.utils.Logger;

import java.io.InputStream;
import java.util.HashMap;

/**
 * 参数解析需要优化逻辑
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class Request {

    private volatile Header header;

    public Request(InputStream inputStream) throws Exception{
        header = new Header();

        String requestSource = "";

        byte[] buffer = new byte[1024];

        int length = 0;

        if((length = inputStream.read(buffer)) > 0) {
            requestSource = new String(buffer, 0, length);
         }

        System.out.println(requestSource);

        //解析请求行信息
        String[] split = requestSource.split("\n")[0].split("\\s");

        header.setMethod(split[0]);

        if (header.getMethod().toUpperCase().equals("GET")){

           if (split[1].contains("?")){
               header.setUrl(split[1].split("\\?")[0]);
               String[] params = split[1].split("\\?")[1].split("&");
               if (params.length>0){
                   for (int i = 0; i < params.length; i++) {
                       header.setParams(params[i].split("=")[0],params[i].split("=")[1]);
                   }
               }
           }else{
               header.setUrl(split[1]);
           }
        }else if(header.getMethod().toUpperCase().equals("POST")){
            header.setUrl(split[1]);
            //TODO 受理数据格式为 username:zhangsan&age:18
            String[] sources = requestSource.split("\n");
            String params = sources[sources.length-1];
            String[] split1 = params.split("&");
           try{
               for (int i = 0; i < split1.length; i++) {
                   header.setParams(split1[i].split(":")[0],split1[i].split(":")[1]);
               }
           }catch (Exception e){
               System.err.println("post 数据参数格式不合法....");
           }
        }else{
            System.err.println("不支持的请求方式....");
        }

    }
    public Header getHeader() {
        return header;
    }
}
