package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.vo.IdVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author status200
 * @date 2017/11/30
 */
@RestController
public class SeminarController {

    @GetMapping("/seminar/{seminarId}")
    public ResponseEntity<List<IdVO>> getSeminarGroupList(@PathVariable("seminarId")BigInteger seminarId) {

        List<IdVO> vos = new ArrayList<>();
        vos.add(new IdVO(new BigInteger("28")));
        vos.add(new IdVO(new BigInteger("29")));

        return new ResponseEntity<>(vos, HttpStatus.OK);
    }

    @GetMapping("/seminar/test")
    public ResponseEntity<String> test() {

        return new ResponseEntity<>("success",HttpStatus.NOT_FOUND);
    }
}
