package xmu.crms.controller;

import xmu.crms.dto.GroupDTO;
import xmu.crms.dto.GroupGradeDTO;
import xmu.crms.dto.StudentDTO;
import com.xmu.ooad.classmanagementsystem.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xmu.crms.vo.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author status200
 * @date 2017/11/30
 */
@RestController
public class GroupController {


    /**
     * 获取小组的信息。
     * 小组选择的话题和小组的得分可以通过 GET /group/{groupId}?embedTopics=true&embedGrade=true获取.
     *
     * @param groupId
     * @param embedTopics
     * @param embedGrade
     * @return
     */
    @GetMapping("/group/{groupId}")
    public ResponseEntity<GroupVO> getGroup(@PathVariable("groupId") BigInteger groupId,
                                            @RequestParam(value = "embedTopics", required = false) Boolean embedTopics,
                                            @RequestParam(value = "embedGrade", required = false) Boolean embedGrade) {
        GroupVO vo = new GroupVO();

        vo.setId(new BigInteger("28"));

        StudentVO leader = new StudentVO();
        leader.setId(new BigInteger("8888"));
        leader.setName("张三");
        vo.setLeader(leader);

        List<StudentVO> members = new ArrayList<>();

        StudentVO student = new StudentVO();
        student.setId(new BigInteger("5324"));
        student.setName("李四");
        members.add(student);

        student = new StudentVO();
        student.setId(new BigInteger("5678"));
        student.setName("王五");
        members.add(student);

        vo.setMembers(members);

        if (embedTopics != null && embedTopics) {
            List<TopicVO> topics = new ArrayList<>();

            TopicVO topic = new TopicVO();
            topic.setId(new BigInteger("257"));
            topic.setName("领域模型与模块");
            topics.add(topic);

            vo.setTopics(topics);
        }

        vo.setReport("");


        if (embedGrade != null && embedGrade) {
            SeminarGradeVO grade = new SeminarGradeVO();
            List<PresentationGradeVO> presentationGradeVOS = new ArrayList<>();

            PresentationGradeVO presentationGradeVO = new PresentationGradeVO();
            presentationGradeVO.setTopicId(new BigInteger("257"));
            presentationGradeVO.setGrade(4);
            presentationGradeVOS.add(presentationGradeVO);

            presentationGradeVO = new PresentationGradeVO();
            presentationGradeVO.setTopicId(new BigInteger("258"));
            presentationGradeVO.setGrade(5);
            presentationGradeVOS.add(presentationGradeVO);

            grade.setPresentationGrade(presentationGradeVOS);
            grade.setReportGrade(3);
            grade.setGrade(4);

            vo.setGrade(grade);
        }

        return new ResponseEntity<>(vo, HttpStatus.OK);
    }

    @PutMapping("/group/{groupId}")
    public ResponseEntity updateGroup(@PathVariable("groupId") BigInteger groupId,
                                      @RequestBody GroupDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/group/{groupId}/grade")
    public ResponseEntity<SeminarGradeVO> getGroupGrade(@PathVariable("groupId") BigInteger groupId) {

        SeminarGradeVO gradeVO = new SeminarGradeVO();
        List<PresentationGradeVO> presentationGradeVOS = new ArrayList<>();

        PresentationGradeVO presentationGradeVO = new PresentationGradeVO();
        presentationGradeVO.setTopicId(new BigInteger("257"));
        presentationGradeVO.setGrade(4);
        presentationGradeVOS.add(presentationGradeVO);

        presentationGradeVO = new PresentationGradeVO();
        presentationGradeVO.setTopicId(new BigInteger("258"));
        presentationGradeVO.setGrade(5);
        presentationGradeVOS.add(presentationGradeVO);

        gradeVO.setPresentationGrade(presentationGradeVOS);
        gradeVO.setReportGrade(3);
        gradeVO.setGrade(4);

        return new ResponseEntity<>(gradeVO, HttpStatus.OK);
    }


    @PostMapping("/group/{groupId}/topic")
    public ResponseEntity<UrlVO> chooseTopic(@PathVariable("groupId") BigInteger seminarId,
                                             @RequestBody TopicVO topicVO) {

        return new ResponseEntity<>(new UrlVO("/group/28/topic/23"), HttpStatus.CREATED);
    }

    /**
     * 提交对其他小组的打分
     *
     * @param groupId
     * @param studentId
     * @param dto
     * @return
     */
    @PutMapping("/group/{groupId}/grade/presentation/{studentId}")
    public ResponseEntity grade(@PathVariable("groupId") BigInteger groupId,
                                @PathVariable("studentId") BigInteger studentId,
                                @RequestBody GroupGradeDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/group/{groupId}/assign")
    public ResponseEntity assignLeader(@PathVariable("groupId") BigInteger groupId,
                                       @RequestBody StudentDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/group/{groupId}/resign")
    public ResponseEntity resignLeader(@PathVariable("groupId") BigInteger groupId,
                                       @RequestBody StudentDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/group/{groupId}/add")
    public ResponseEntity addMember(@PathVariable("groupId") BigInteger groupId,
                                    @RequestBody StudentDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/group/{groupId}/remove")
    public ResponseEntity removeMember(@PathVariable("groupId") BigInteger groupId,
                                    @RequestBody StudentDTO dto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
