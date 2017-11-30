package com.xmu.ooad.classmanagementsystem.dto;

import lombok.Data;

/**
 *
 * @author status200
 * @date 2017/11/28
 */
@Data
public class UserInfoDTO {

    private String name;
    private String number;
    private String email;
    private String gender;
    private String title;
    private String avatar;


    public UserInfoDTO(String name, String number, String email, String gender, String title, String avatar) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.gender = gender;
        this.title = title;
        this.avatar = avatar;
    }
}
