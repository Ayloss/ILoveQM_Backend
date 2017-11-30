package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.dto.BindAccountDTO;
import com.xmu.ooad.classmanagementsystem.dto.SignInDTO;
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
public class PersonInfoController {

    /**
     * 获取用户信息。
     * 用户的类型需要使用jwt进行判断。
     *
     * @return
     */    @GetMapping("/me")
    public ResponseEntity<UserInfoVO> getMe() {

        UserInfoVO vo = new UserInfoVO();
        vo.setId(new BigInteger("3486"));
        vo.setName("邱明");
        vo.setType("teacher");
        vo.setNumber("24321432534");
        vo.setAvatar("/avatar/3486.png");
        return new ResponseEntity<UserInfoVO>(vo, HttpStatus.OK);
    }

    /**
     * 绑定账号
     *
     * @param dto
     * @return
     */
    @PutMapping("/me")
    public ResponseEntity bindAccount(@RequestBody BindAccountDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    /**
     * 登录
     *
     * @param dto
     * @return
     */
    @PostMapping("/signin")
    public ResponseEntity<SignInVO> signIn(@RequestBody SignInDTO dto) {

        return new ResponseEntity<SignInVO>(
                new SignInVO(
                        new BigInteger("3486"),
                        "student",
                        "张三",
                        "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjaWQiOiJPQTAwMDEiLCJpYXQiOjE0ODI2NTcyODQyMjF9.TeJpy936w610Vrrm+c3+RXouCA9k1AX0Bk8qURkYkdo="
                ),
                HttpStatus.OK);
    }
}
