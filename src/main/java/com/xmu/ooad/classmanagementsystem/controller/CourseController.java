package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.vo.CourseVO;
import com.xmu.ooad.classmanagementsystem.vo.SeminarVO;
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
 * @date 2017/11/28
 */
@RestController
public class CourseController {

    @GetMapping("/course")
    public ResponseEntity<List<CourseVO>> getCourseList() {

        ArrayList<CourseVO> vos = new ArrayList<>();
        CourseVO vo = new CourseVO();
        vo.setId(new BigInteger("1"));
        vo.setName("J2EE");
        vos.add(vo);
        vo = new CourseVO();
        vo.setId(new BigInteger("2"));
        vo.setName("J2EE");
        vos.add(vo);

        return new ResponseEntity<>(vos, HttpStatus.OK);
    }


    @GetMapping("/course/{courseId}")
    public ResponseEntity<CourseVO> getCourseDetail(@PathVariable("courseId") BigInteger courseId) {

        return new ResponseEntity<>(
                new CourseVO(new BigInteger("23"), "OOAD", "面向对象分析与设计"),
                HttpStatus.OK
        );
    }

    @GetMapping("/course/{courseId}/seminar")
    public ResponseEntity<List<SeminarVO>> getSeminar(@PathVariable("courseId") BigInteger courseId) {
        List<SeminarVO> list = new ArrayList<>();
        list.add(new SeminarVO(new BigInteger("29"), "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09"));
        list.add(new SeminarVO(new BigInteger("32"), "概要设计", "模型层与数据库设计", "fixed", "2017-10-10", "2017-10-24"));

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
