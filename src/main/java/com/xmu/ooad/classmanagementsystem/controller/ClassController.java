package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.dto.ClassDTO;
import com.xmu.ooad.classmanagementsystem.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author status200
 * @date 2017/11/29
 */
@RestController("/class")
public class ClassController {


    @PutMapping("/{classId}")
    public ResponseEntity updateClass(@PathVariable("classId") BigInteger classId,@RequestBody ClassDTO dto) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{classId}/attendance")
    public ResponseEntity<PresentVO> getAttendance(@PathVariable("classId") BigInteger classId,
                                                   @RequestParam("showPresent") Boolean showPresent,
                                                   @RequestParam("showLate") Boolean showLate,
                                                   @RequestParam("showAbsent") Boolean showAbsent) {

        List<PresentStudentVO> presentStudents = new ArrayList<>();
        presentStudents.add(new PresentStudentVO(new BigInteger("2357"),"张三"));
        presentStudents.add(new PresentStudentVO(new BigInteger("8232"), "李四"));

        PresentVO vo = new PresentVO(4, presentStudents);

        return new ResponseEntity<PresentVO>(vo, HttpStatus.OK);
    }
}

