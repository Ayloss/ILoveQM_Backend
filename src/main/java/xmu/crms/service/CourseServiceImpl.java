package xmu.crms.service;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.InfoIllegalException;
import xmu.crms.exception.UserNotFoundException;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by status200 on 2017/12/19.
 */
public class CourseServiceImpl implements CourseService {
    @Override
    public List<Course> listCourseByUserId(BigInteger userId) throws InfoIllegalException, CourseNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertCourseByUserId(BigInteger userId, Course course) throws InfoIllegalException {
        return null;
    }

    @Override
    public Course getCourseByCourseId(BigInteger courseId) throws InfoIllegalException, CourseNotFoundException {
        return null;
    }

    @Override
    public Boolean updateCourseByCourseId(BigInteger courseId, Course course) {
        return null;
    }

    @Override
    public Boolean deleteCourseByCourseId(BigInteger courseId) throws InfoIllegalException, CourseNotFoundException {
        return null;
    }

    @Override
    public List<Course> listCourseByCourseName(String courseName) throws InfoIllegalException, CourseNotFoundException {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByCourseName(String courseName) throws InfoIllegalException, CourseNotFoundException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByTeacherName(String teacherName) throws UserNotFoundException, CourseNotFoundException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByUserId(BigInteger userId) throws InfoIllegalException, CourseNotFoundException, ClassNotFoundException {
        return null;
    }
}
