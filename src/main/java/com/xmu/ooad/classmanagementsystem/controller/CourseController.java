package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.vo.ClassVO;
import com.xmu.ooad.classmanagementsystem.vo.CourseVO;
import com.xmu.ooad.classmanagementsystem.vo.SeminarVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
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
        vo.setName("OOAD");
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
    public ResponseEntity<List<SeminarVO>> getSeminar(@PathVariable("courseId") BigInteger courseId,
                                                      @RequestParam(value = "embedGrade", required = false) Boolean embedGrade) {
        List<SeminarVO> list = new ArrayList<>();
        SeminarVO seminar = new SeminarVO();
        seminar.setId(new BigInteger("29"));
        seminar.setName("界面原型设计");
        seminar.setDescription("界面原型设计");
        seminar.setGroupingMethod("fixed");
        seminar.setStartTime("2017-09-25");
        seminar.setEndTime("2017-10-09");
        if (embedGrade != null && embedGrade) {
            seminar.setGrade(4);
        }
        list.add(seminar);

        seminar = new SeminarVO();
        seminar.setId(new BigInteger("32"));
        seminar.setName("概要设计");
        seminar.setGroupingMethod("fixed");
        seminar.setDescription("模型层与数据库设计");
        seminar.setStartTime("2017-10-10");
        seminar.setEndTime("2017-10-24");
        if (embedGrade != null && embedGrade) {
            seminar.setGrade(5);
        }
        list.add(seminar);


        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/course/{courseId}/class")
    public ResponseEntity<List<ClassVO>> getCourseClasses(@PathVariable("courseId") BigInteger courseId) {

        List<ClassVO> vos = new ArrayList<>();
        ClassVO vo = new ClassVO();
        vo.setId(new BigInteger("45"));
        vo.setName("周三1-2节");
        vos.add(vo);

        vo = new ClassVO();
        vo.setId(new BigInteger("48"));
        vo.setName("周三3-4节");
        vos.add(vo);

        return new ResponseEntity<>(vos, HttpStatus.OK);
    }

    @GetMapping("/course/{courseId}/seminar/current")
    public ResponseEntity<SeminarVO> getCurrentSeminar(@PathVariable("courseId") BigInteger courseId) {

        SeminarVO seminar = new SeminarVO();
        seminar.setId(new BigInteger("29"));
        seminar.setName("界面原型设计");
        seminar.setCourseName("OOAD");
        seminar.setGroupingMethod("fixed");
        seminar.setStartTime("2017-09-25");
        seminar.setEndTime("2017-10-09");

        List<ClassVO> classes = new ArrayList<>();
        ClassVO clas = new ClassVO();
        clas.setId(new BigInteger("53"));
        clas.setName("周三12");
        classes.add(clas);

        classes = new ArrayList<>();
        clas = new ClassVO();
        clas.setId(new BigInteger("57"));
        clas.setName("周三34");
        classes.add(clas);

        seminar.setClasses(classes);

        return new ResponseEntity<>(seminar,HttpStatus.OK);
    }
}
