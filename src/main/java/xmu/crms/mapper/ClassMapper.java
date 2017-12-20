package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import xmu.crms.entity.ClassInfo;
import xmu.crms.exception.CourseNotFoundException;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author status200
 * @date 2017/12/19
 */
@Mapper
@Component
public interface ClassMapper {

    /**
     * 根据课堂id删除CourseSelection中的选课记录。
     *
     * @param classId 课堂id
     */
    void deleteClassSelectionByClassId(BigInteger classId);

    /**
     * 按班级id获取班级详情.
     * <p>
     * 根据班级id获取班级<br>
     *
     * @param classId 班级id
     * @return 班级信息
     */
    ClassInfo getClassByClassId(BigInteger classId);

    /**
     * 按班级id和班级修改班级信息.
     * <p>
     * 根据班级id修改班级信息<br>
     *
     * @param classId 班级ID
     */
    void updateClassByClassId(@Param("classId") BigInteger classId, @Param("newClass") ClassInfo newClass);

    /**
     * 根据课程ID获得班级列表.
     *
     * @param courseId
     * @return
     * @throws CourseNotFoundException
     */
    List<ClassInfo> listClassByCourseId(BigInteger courseId);
}
