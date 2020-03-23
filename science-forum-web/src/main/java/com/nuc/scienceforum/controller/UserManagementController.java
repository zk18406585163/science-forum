package com.nuc.scienceforum.controller;


import com.nuc.scienceforum.biz.service.UserAuthService;
import com.nuc.scienceforum.common.model.UserAuth;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user/management")
public class UserManagementController {

    @Resource
    private UserAuthService userAuthService;

    @ResponseBody
    @RequestMapping(value = "/auth/username/{username}", method = RequestMethod.GET)
    public UserAuth getUserAuthByUsername(@PathVariable(name = "username") String username){
        return userAuthService.getUserAuthByUsername(username);
    }
}
