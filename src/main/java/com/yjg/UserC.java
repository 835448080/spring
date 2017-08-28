package com.yjg;

import com.yjg.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qin on 17-8-28.
 */
@Controller
@RequestMapping("/user")
public class UserC {
    @ResponseBody
    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public String userInfo(HttpServletRequest request){
        return request.getPathInfo();
    }
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public User userList(@RequestBody User user){
        return user;
    }
    @ResponseBody
    @RequestMapping(value = "/friend/{id}/{uid}",method = RequestMethod.GET)
    public String friend(@PathVariable("id")String id,
                         @PathVariable("uid")String uid){
        return null;

    }

}

