package com.gientech.account.entity;

import lombok.Data;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 15:27
 * @Description: com.gientech.account.entity
 * @version: 1.0
 */
@Data
public class UserInfoDto {
    private String userId;
    private String userName;
    private String gender;
    private String phone;
}
