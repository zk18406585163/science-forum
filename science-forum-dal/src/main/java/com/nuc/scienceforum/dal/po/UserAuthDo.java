package com.nuc.scienceforum.dal.po;

import com.nuc.scienceforum.common.model.UserAuth;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthDo {

    private Long id;

    private Long userId;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date createAt;

    private Date updateAt;

    public static UserAuth doToPojo(UserAuthDo userAuthDo){
        return UserAuth.builder()
                .email(userAuthDo.getEmail())
                .password(userAuthDo.getPassword())
                .phone(userAuthDo.getPhone())
                .userId(userAuthDo.getUserId())
                .username(userAuthDo.getUsername())
                .build();
    }

}
