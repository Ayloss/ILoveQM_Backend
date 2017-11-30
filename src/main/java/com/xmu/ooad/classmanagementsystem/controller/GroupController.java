package com.xmu.ooad.classmanagementsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

/**
 *
 * @author status200
 * @date 2017/11/30
 */
@RestController
public class GroupController {

    @PutMapping("/group/{groupId}")
    public ResponseEntity updateGroup(@PathVariable("groupId") BigInteger groupId) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
