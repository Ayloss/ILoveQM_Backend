package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.vo.UrlVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author status200
 * @date 2017/11/30
 */
@RestController
public class UploadController {

    @PostMapping("/upload/avatar")
    public ResponseEntity<UrlVO> updateAvatar() {

        return new ResponseEntity<>(new UrlVO("/avatar/3486.png"), HttpStatus.CREATED);
    }


}
