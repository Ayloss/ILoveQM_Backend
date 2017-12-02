package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author status200
 * @date 2017/11/30
 */
@RestController
public class SeminarController {

    @GetMapping("/seminar/{seminarId}")
    public ResponseEntity<SeminarVO> getSeminar(@PathVariable("seminarId") BigInteger seminarId) {

        SeminarVO vo = new SeminarVO();
        vo.setId(new BigInteger("1"));
        vo.setName("讨论课1");
        vo.setDescription("第一章练习");
        vo.setGroupingMethod("固定分组");
        vo.setStartTime("11/10/2017");
        vo.setEndTime("17/10/2017");

        return new ResponseEntity<>(vo, HttpStatus.OK);
    }


    /**
     * 获得分组信息
     *
     * @param seminarId
     * @param includedStudentId 该讨论课中的某个学生id
     * @param gradeable 是否获取打分状态
     * @return includedStudentId存在, 则返回该学生所在的小组的Id.
     *          gradeable为true,,则返回学生可打分的组的列表.
     */
    @GetMapping("/seminar/{seminarId}/group")
    public ResponseEntity<List<GroupVO>> getGroup(@PathVariable("seminarId") BigInteger seminarId,
                                            @RequestParam("include") BigInteger includedStudentId,
                                            @RequestParam("gradeable") Boolean gradeable) {
        List<GroupVO> vos = new ArrayList<>();

        if (includedStudentId != null) {
            GroupVO group = new GroupVO();
            group.setId(new BigInteger("28"));
            vos.add(group);
        } else if(gradeable) {

            GroupVO group = new GroupVO();
            group.setId(new BigInteger("27"));
            vos.add(group);

            group = new GroupVO();
            group.setId(new BigInteger("29"));
            vos.add(group);
        }

        return new ResponseEntity<>(vos, HttpStatus.OK);
    }


    @GetMapping("/seminar/{seminarId}/topic")
    public ResponseEntity<List<TopicVO>> getTopics(@PathVariable("seminarId") BigInteger seminarId) {

        List<TopicVO> vos = new ArrayList<>();

        TopicVO topic = new TopicVO();
        topic.setId(new BigInteger("257"));
        topic.setName("领域模型与模块");
        topic.setDescription("Domain model与模块划分");
        topic.setGroupLimit(5);
        topic.setGroupLeft(2);

        vos.add(topic);

        return new ResponseEntity<>(vos, HttpStatus.OK);
    }

    @GetMapping("/seminar/{seminarId}/detail")
    public ResponseEntity<SeminarVO> getSeminarDetail(@PathVariable("seminarId") BigInteger seminarId) {

        SeminarVO vo = new SeminarVO();
        vo.setId(new BigInteger("32"));
        vo.setName("概要设计");
        vo.setStartTime("2017-10-10");
        vo.setEndTime("2017-10-24");
        vo.setSite("海韵201");
        vo.setTeacherName("邱明");
        vo.setTeacherEmail("mingqiu@xmu.edu.cn");

        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
}
