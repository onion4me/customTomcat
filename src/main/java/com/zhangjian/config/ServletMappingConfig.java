package com.zhangjian.config;

import com.zhangjian.model.ServletMapping;

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

    public ServletMappingConfig(String resources){
        servletMappingHashSet.add(new ServletMapping("index", "/index", "myTomcat.test.IndexServlet"));
        servletMappingHashSet.add(new ServletMapping("index", "/index", "myTomcat.test.IndexServlet"));
    }

    public Set<ServletMapping> getServletMappingHashSet() {
        return servletMappingHashSet;
    }

    public void setServletMappingHashSet(Set<ServletMapping> servletMappingHashSet) {
        this.servletMappingHashSet = servletMappingHashSet;
    }
}
