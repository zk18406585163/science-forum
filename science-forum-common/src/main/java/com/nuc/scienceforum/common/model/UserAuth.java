package com.nuc.scienceforum.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAuth {

    private Long userId;

    private String username;

    private String password;

    private String phone;

    private String email;

}
