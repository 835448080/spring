package com.yjg.util;

import com.alibaba.fastjson.JSON;
import com.yjg.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qin on 17-8-28.
 */

public class JasonUtil {
    public static String Json(){
        String str="{\n"+
                "\"uid\"=\"sdfsdf\",\n" +
                "        \"token\"=\"33223234\"+" +
                "}";
        User user= JSON.parseObject(str,User.class);
        List<User> list=new ArrayList<User>();
        int i=0;
        while (i<10){
            i+=1;
            User u=new User();
            u.setToken(String.valueOf(i));
            list.add(u);
        }
        JSON.toJSONString(list);
        JSON.toJSONString(new ArrayList<User>());
        JSON.toJSONString("");
        return null;

    }
}
