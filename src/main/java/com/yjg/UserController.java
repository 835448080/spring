package com.yjg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by qin on 17-8-27.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @ResponseBody
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String userInfo(){
        return "123";
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView userList(){
        return null;
    }
}
