package xmu.crms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.entity.ClassInfo;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.SeminarNotFoundException;
import xmu.crms.mapper.ClassMapper;
import xmu.crms.mapper.CourseMapper;

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

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Boolean deleteClassSelectionByClassId(BigInteger classId) {
        classMapper.deleteClassSelectionByClassId(classId);

        return true;
    }

    @Override
    public List<ClassInfo> listClassByName(String courseName, String teacherName) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByCourseId(BigInteger courseId) throws CourseNotFoundException {

        
        return classMapper.listClassByCourseId(courseId);
    }

    @Override
    public ClassInfo getClassByClassId(BigInteger classId) {
        return classMapper.getClassByClassId(classId);
    }

    @Override
    public Boolean updateClassByClassId(BigInteger classId, ClassInfo newClass) throws ClassNotFoundException {
        classMapper.updateClassByClassId(classId,newClass);

        return true;
    }

    @Override
    public Boolean deleteClassByClassId(BigInteger classId) {
        return null;
    }

    @Override
    public String insertCourseSelectionById(BigInteger userId, BigInteger classId) {
        return null;
    }

    @Override
    public Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId) {
        return null;
    }

    @Override
    public ClassInfo getCallStatusById(BigInteger seminarId) throws SeminarNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertClassById(BigInteger userId, BigInteger courseId) {
        return null;
    }

    @Override
    public Boolean deleteClassByCourseId(BigInteger courseId) {
        return null;
    }

    @Override
    public Boolean deleteScoreRuleById(BigInteger classId) {
        return null;
    }

    @Override
    public ClassInfo getScoreRule(BigInteger classId) {
        return null;
    }

    @Override
    public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions) {
        return null;
    }

    @Override
    public Boolean updateScoreRule(BigInteger classId, ClassInfo proportions) {
        return null;
    }
}
