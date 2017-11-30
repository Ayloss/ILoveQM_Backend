package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.vo.ClassListItemVO;
import com.xmu.ooad.classmanagementsystem.vo.CourseListItemVO;
import com.xmu.ooad.classmanagementsystem.vo.CourseVO;
import com.xmu.ooad.classmanagementsystem.vo.SeminarVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author status200
 * @date 2017/11/28
 */
@RestController("/course")
public class CourseController {

    @GetMapping("/")
    public ResponseEntity<List<CourseListItemVO>> getCourseList() {

        ArrayList<CourseListItemVO> vos = new ArrayList<CourseListItemVO>();

        vos.add(new CourseListItemVO(new BigInteger("1"),"OOAD",6));
        vos.add(new CourseListItemVO(new BigInteger("2"), "J2EE", 4));

        return new ResponseEntity<>(vos, HttpStatus.OK);
    }


    @GetMapping("/{courseId}")
    public ResponseEntity<CourseVO> getCourseDetail(@PathVariable("courseId") BigInteger courseId) {

        return new ResponseEntity<>(
                new CourseVO(new BigInteger("23"), "OOAD", "面向对象分析与设计"),
                HttpStatus.OK
        );
    }

    @GetMapping("/{courseId}/seminar")
    public ResponseEntity<List<SeminarVO>> getSeminar(@PathVariable("courseId") BigInteger courseId) {
        List<SeminarVO> list = new ArrayList<>();
        list.add(new SeminarVO(new BigInteger("29"), "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09"));
        list.add(new SeminarVO(new BigInteger("32"), "概要设计", "模型层与数据库设计", "fixed", "2017-10-10", "2017-10-24"));

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{courseId}/class")
    public ResponseEntity<List<ClassListItemVO>> getClassList(@PathVariable("courseId") BigInteger courseId) {
        List<ClassListItemVO> items = new ArrayList<>();
        items.add(new ClassListItemVO(new BigInteger("45"),"周三1-2节"));
        items.add(new ClassListItemVO(new BigInteger("48"),"周三3-4节"));

        return new ResponseEntity<List<ClassListItemVO>>(items, HttpStatus.OK);
    }
}
