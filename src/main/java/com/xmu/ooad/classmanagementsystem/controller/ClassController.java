package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.dto.ClassDTO;
import com.xmu.ooad.classmanagementsystem.dto.GpsDTO;
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
@RestController
public class ClassController {

    @GetMapping("/class/{classId}")
    public ResponseEntity<ClassVO> getClass(@PathVariable("classId") BigInteger classId) {
        ClassVO vo = new ClassVO();
        vo.setId(new BigInteger("23"));
        vo.setName("周三1-2节");
        vo.setNumStudent(120);
        vo.setCalling(-1);
        vo.setRoster("/roster/周三12班.xlsx");
        ClassProportionsVO classProportionsVO = new ClassProportionsVO();
        classProportionsVO.setA(20);
        classProportionsVO.setB(60);
        classProportionsVO.setC(20);
        classProportionsVO.setReport(50);
        classProportionsVO.setPresentation(50);
        vo.setProportions(classProportionsVO);

        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    @PutMapping("/class/{classId}")
    public ResponseEntity updateClass(@PathVariable("classId") BigInteger classId,@RequestBody ClassDTO dto) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/class/{classId}/attendance")
    public ResponseEntity<PresentVO> getAttendance(@PathVariable("classId") BigInteger classId,
                                                   @RequestParam(value = "showPresent",required = false) Boolean showPresent,
                                                   @RequestParam(value = "showLate",required = false) Boolean showLate,
                                                   @RequestParam(value = "showAbsent",required = false) Boolean showAbsent) {

        List<StudentVO> presentStudents = new ArrayList<>();
        StudentVO studentVO = new StudentVO();
        studentVO.setId(new BigInteger("2357"));
        studentVO.setName("张三");
        presentStudents.add(studentVO);
        studentVO = new StudentVO();
        studentVO.setId(new BigInteger("8232"));
        studentVO.setName("李四");
        presentStudents.add(studentVO);

        PresentVO vo = new PresentVO();
        vo.setNumPresent(2);
        vo.setPresent(presentStudents);

        return new ResponseEntity<>(vo, HttpStatus.OK);
    }

    /**
     * 签到
     *
     * @param classId
     * @param studentId
     * @param dto 请求的gps数据
     * @return
     */
    @PutMapping("/class/{classId}/attendance/{studentId}")
    public ResponseEntity rollCall(@PathVariable("classId") BigInteger classId,
                                   @PathVariable("studentId") BigInteger studentId,
                                   @RequestBody GpsDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/class/{classId}/classgroup")
    public ResponseEntity<GroupVO> getClassGroup(@PathVariable("classId") BigInteger classId) {

        GroupVO vo = new GroupVO();
        StudentVO leader = new StudentVO();
        leader.setId(new BigInteger("2757"));
        leader.setName("张三");
        leader.setNumber("23320152202333");
        vo.setLeader(leader);

        List<StudentVO> members = new ArrayList<>();
        StudentVO student = new StudentVO();
        student.setId(new BigInteger("2756"));
        student.setName("李四");
        student.setNumber("23320152202443");
        members.add(student);

        student = new StudentVO();
        student.setId(new BigInteger("2777"));
        student.setName("王五");
        student.setNumber("23320152202433");
        members.add(student);

        vo.setMembers(members);

        return new ResponseEntity<GroupVO>(vo, HttpStatus.OK);
    }
}

