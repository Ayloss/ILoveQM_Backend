package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.dto.SignInDTO;
import com.xmu.ooad.classmanagementsystem.dto.UserInfoDTO;
import com.xmu.ooad.classmanagementsystem.vo.SchoolVO;
import com.xmu.ooad.classmanagementsystem.vo.SignInVO;
import com.xmu.ooad.classmanagementsystem.vo.UserInfoVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

/**
 *
 * @author status200
 * @date 2017/11/27
 */
@RestController
public class MeController {

    /**
     * 获取用户信息。
     * 用户的类型需要使用jwt进行判断。
     *
     * @return
     */
    @GetMapping("/me")
    public ResponseEntity<UserInfoVO> getMe() {

        UserInfoVO vo = new UserInfoVO();
        vo.setId(new BigInteger("3486"));
        vo.setType("teacher");
        vo.setName("邱明");
        vo.setNumber("24321432534");
        vo.setPhone("18911114514");
        vo.setEmail("23320152202333@stu.xmu.edu.cn");
        vo.setGender("male");

        SchoolVO school = new SchoolVO();
        school.setId(new BigInteger("32"));
        school.setName("厦门大学");

        vo.setSchool(school);
        vo.setTitle("教授");
        vo.setAvatar("/avatar/3486.png");

        return new ResponseEntity<>(vo, HttpStatus.OK);
    }

    /**
     * 绑定账号
     *
     * @param dto
     * @return
     */
    @PutMapping("/me")
    public ResponseEntity bindAccount(@RequestBody UserInfoDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    /**
     * 微信小程序/OAuth2登录
     */
    @GetMapping("/signin")
    public ResponseEntity<SignInVO> signIn(@RequestParam(value = "code",required = false) String code,
                                           @RequestParam("state") String state,
                                           @RequestParam(value = "success_url",required = false) String successUrl) {

        SignInVO vo = new SignInVO();
        vo.setId(new BigInteger("3486"));
        vo.setType("student");
        vo.setName("张三");
        vo.setJwt("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjaWQiOiJPQTAwMDEiLCJpYXQiOjE0ODI2NTcyODQyMjF9.TeJpy936w610Vrrm+c3+RXouCA9k1AX0Bk8qURkYkdo=");


        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
}
