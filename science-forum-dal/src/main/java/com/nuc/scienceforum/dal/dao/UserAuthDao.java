package com.nuc.scienceforum.dal.dao;

import com.nuc.scienceforum.dal.po.UserAuthDo;

public interface UserAuthDao {

    UserAuthDo selectUserAuthByCondition(UserAuthDo userAuthDo);

}
