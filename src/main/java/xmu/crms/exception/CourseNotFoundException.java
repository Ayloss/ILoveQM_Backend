package xmu.crms.exception;

import java.math.BigInteger;

/**
 * 课程未找到时抛出的异常
 *
 * @see xmu.crms.service.ClassService
 * @author Status200
 */
public class CourseNotFoundException extends Exception {

    public CourseNotFoundException(BigInteger courseId) {
        super(String.format("Course %d Not Found!", courseId));
    }
}
