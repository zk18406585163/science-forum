package com.nuc.scienceforum.biz.service.impl;

import com.nuc.scienceforum.biz.service.UserAuthService;
import com.nuc.scienceforum.common.model.UserAuth;
import com.nuc.scienceforum.dal.dao.UserAuthDao;
import com.nuc.scienceforum.dal.po.UserAuthDo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    @Resource
    private UserAuthDao userAuthDao;

    @Override
    public Boolean checkPassword(UserAuth userAuth) {
        return null;
    }

    @Override
    public UserAuth getUserAuthByUsername(String username) {
        if(username==null || username.equals(""))
            return null;
        UserAuthDo userAuthDo = userAuthDao.selectUserAuthByCondition(UserAuthDo.builder()
                .username(username)
                .build());
        return UserAuthDo.doToPojo(userAuthDo);
    }
}
