package com.orange.ifitdiet.common;

import java.util.HashMap;

/**
 * Created by 廖俊瑶 on 2016/10/12.
 */
public class BeanPool {
    private HashMap<String,Bean> beanMap;

    public BeanPool() {
        beanMap = new HashMap<String, Bean>();
    }

    /**
     * 获取BeanPool
     *
     * @return 返回BeanPool的实例
     */
    public HashMap<String,Bean> getBeanMap() {
        return beanMap;
    }

}
