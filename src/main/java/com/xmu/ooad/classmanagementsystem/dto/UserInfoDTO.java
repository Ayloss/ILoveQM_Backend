package com.xmu.ooad.classmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author status200
 * @date 2017/11/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfoDTO {

    private String name;
    private String number;
    private String email;
    private String gender;
    private String title;
    private String avatar;
    private SchoolDTO school;
    private String unionID;
    private String phone;
}
