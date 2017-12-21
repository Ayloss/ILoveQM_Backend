package xmu.crms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.entity.ClassInfo;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.SeminarNotFoundException;
import xmu.crms.mapper.ClassMapper;

import java.math.BigInteger;
import java.util.List;

/**
 *
 *
 * @author status200
 * @date 2017/12/19
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;


    @Override
    public Boolean deleteClassSelectionByClassId(BigInteger classId) {
        classMapper.deleteCourseSelectionByClassId(classId);

        return true;
    }

    @Override
    public List<ClassInfo> listClassByName(String courseName, String teacherName) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByCourseId(BigInteger courseId) throws CourseNotFoundException {

        // 先查询Course是否存在
        if(classMapper.countCourseByCourseId(courseId) <= 0) {
            throw new CourseNotFoundException(courseId);
        }

        return classMapper.listClassByCourseId(courseId);
    }

    @Override
    public ClassInfo getClassByClassId(BigInteger classId) {
        return classMapper.getClassByClassId(classId);
    }

    @Override
    public Boolean updateClassByClassId(BigInteger classId, ClassInfo newClass) throws ClassNotFoundException {
        // TODO:先查询class是否存在

        classMapper.updateClassByClassId(classId,newClass);

        return true;
    }

    @Override
    public Boolean deleteClassByClassId(BigInteger classId) {

        classMapper.deleteClassById(classId);


        return true;
    }

    @Override
    public String insertCourseSelectionById(BigInteger userId, BigInteger classId) {

        classMapper.insertCourseSelectionById(userId,classId);

        // TODO:返回选课的url
        return "";
    }

    @Override
    public Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId) {
        return classMapper.deleteCourseSelectionByStudentIdAndClassId(userId,classId) >= 1;
    }

    @Override
    public ClassInfo getCallStatusById(BigInteger seminarId) throws SeminarNotFoundException {
        return null;
    }

    // TODO:该service有问题，标准组修改中
    @Override
    public BigInteger insertClassById(BigInteger userId, BigInteger courseId) {
        return null;
    }

    @Override
    public Boolean deleteClassByCourseId(BigInteger courseId) throws CourseNotFoundException {

        if(classMapper.countCourseByCourseId(courseId) <= 0) {
            throw new CourseNotFoundException(courseId);
        }
        // 获取该课程下的所有班级
        List<ClassInfo> classInfoList = classMapper.listClassByCourseId(courseId);

        classInfoList.forEach(e->{
            // 删除所有班级的选课记录
            classMapper.deleteCourseSelectionByClassId(e.getId());
            // 删除该班级
            classMapper.deleteClassById(e.getId());
        });


        return true;
    }


    @Override
    public Boolean deleteScoreRuleById(BigInteger classId) throws ClassNotFoundException{

        return classMapper.deleteScoreRuleById(classId) >= 1;
    }

    @Override
    public ClassInfo getScoreRule(BigInteger classId) throws ClassNotFoundException {
        return classMapper.getScoreRuleByClassId(classId);
    }

    @Override
    public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions) {

        classMapper.updateScoreRuleById(classId,proportions);

        return classId;
    }

    @Override
    public Boolean updateScoreRule(BigInteger classId, ClassInfo proportions) {
        return classMapper.updateScoreRuleById(classId,proportions) >=1;
    }
}
