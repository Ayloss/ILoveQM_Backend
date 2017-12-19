package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xmu.crms.dto.ClassDTO;
import xmu.crms.vo.ClassProportionsVO;
import xmu.crms.vo.ClassVO;
import xmu.crms.vo.GroupVO;
import xmu.crms.vo.StudentVO;

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

    @GetMapping("/class")
    public ResponseEntity<List<ClassVO>> getClasses() {
        List<ClassVO> vos = new ArrayList<>();

        ClassVO vo = new ClassVO();
        vo.setId(new BigInteger("23"));
        vo.setName("周三1-2节");
        vo.setNumStudent(60);
        vo.setTime("周三1-2、周五1-2");
        vo.setSite("公寓405");
        vo.setCourseName("OOAD");
        vo.setCourseTeacher("邱明");
        vos.add(vo);

        vo = new ClassVO();
        vo.setId(new BigInteger("42"));
        vo.setName("一班");
        vo.setNumStudent(60);
        vo.setTime("周三34、周五12");
        vo.setSite("公海韵202");
        vo.setCourseName(".Net 平台开发");
        vo.setCourseTeacher("邱明");
        vos.add(vo);

        return new ResponseEntity<List<ClassVO>>(vos, HttpStatus.OK);
    }


    @GetMapping("/class/{classId}")
    public ResponseEntity<ClassVO> getClass(@PathVariable("classId") BigInteger classId) {
        ClassVO vo = new ClassVO();
        vo.setId(new BigInteger("23"));
        vo.setName("周三1-2节");
        vo.setTime("周三1-2、周五1-2");
        vo.setSite("公寓405");
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

