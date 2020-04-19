package com.zhangjian.config;

import com.zhangjian.BootStrap;
import com.zhangjian.model.ServletMapping;
import com.zhangjian.utils.Logger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class ServletMappingConfig {
    private Set<ServletMapping> servletMappingHashSet = new HashSet<>();

    public ServletMappingConfig(String resources) {
        Logger.log(BootStrap.class,"ServletMappingConfig执行初始化");
        servletMappingHashSet.add(new ServletMapping("test1", "/test1", "com.zhangjian.example.MyServlet"));
        servletMappingHashSet.add(new ServletMapping("test2", "/test2", "com.zhangjian.example.MyServlet"));
    }

    public Set<ServletMapping> getServletMappingHashSet() {
        return servletMappingHashSet;
    }

    public void setServletMappingHashSet(Set<ServletMapping> servletMappingHashSet) {
        this.servletMappingHashSet = servletMappingHashSet;
    }
}
