package xmu.crms.service;

import org.springframework.stereotype.Service;
import xmu.crms.entity.ClassInfo;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * Created by status200 on 2017/12/19.
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Override
    public Boolean deleteClassSelectionByClassId(BigInteger classId) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByName(String courseName, String teacherName) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByCourseId(BigInteger courseId) {
        return null;
    }

    @Override
    public ClassInfo getClassByClassId(BigInteger classId) {
        return null;
    }

    @Override
    public Boolean updateClassByClassId(BigInteger classId) {
        return null;
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
    public ClassInfo getCallGroupStatusById(BigInteger seminarId) {
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
