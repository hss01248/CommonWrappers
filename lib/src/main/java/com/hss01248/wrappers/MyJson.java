package com.hss01248.wrappers;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * 依赖于fastjson,也可以改成gson.api不变
 * Created by Administrator on 2016/9/23 0023.
 */
public class MyJson {
    public static String toJsonStr(Object obj){
        return JSON.toJSONString(obj);
    }


    public static <T> T  parseObject(String str,Class<T> clazz){
        return JSON.parseObject(str,clazz);
    }

    public static  <E> List<E> parseArray(String str, Class<E> clazz){
        return JSON.parseArray(str,clazz);
    }
}
