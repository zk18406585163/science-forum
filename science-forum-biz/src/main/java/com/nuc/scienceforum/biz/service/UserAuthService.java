package com.nuc.scienceforum.biz.service;

import com.nuc.scienceforum.common.model.UserAuth;

public interface UserAuthService {

    Boolean checkPassword(UserAuth userAuth);

    UserAuth getUserAuthByUsername(String username);

}
