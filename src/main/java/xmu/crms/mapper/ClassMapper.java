package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
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
    void deleteCourseSelectionByClassId(BigInteger classId);

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


    /**
     * 根据学生id和班级id插入一条选课记录
     *
     * @param userId
     * @param classId
     * @return 插入的记录数量
     */
    Integer insertCourseSelectionById(@Param("userId") BigInteger userId, @Param("classId") BigInteger classId);


    /**
     * 学生按班级id和用户id取消选择班级.
     * <p>
     * 根据班级id和用户id删除选课记录及与该班级相关的信息<br>
     *
     * @param userId  用户id
     * @param classId 班级id
     * @return 删除的记录的数量
     * @author yexiaona
     */
    Integer deleteCourseSelectionByStudentIdAndClassId(@Param("userId") BigInteger userId, @Param("classId") BigInteger classId);


    /**
     * 按classId删除ScoreRule.
     * ScoreRule在class_info表中.
     * 实际上调用的是update.
     *
     * @param classId 班级Id
     * @return 删除的数量
     */
    Integer deleteScoreRuleById(@Param("classId") BigInteger classId);


    /**
     * 查询评分规则.
     * <p>
     * 按id查询指定的评分规则<br>
     *
     * @param classId  班级id
     * @return 查询出来的班级
     */
    ClassInfo getScoreRuleByClassId(@Param("classId") BigInteger classId);


    /**
     * 新增评分规则.
     * <p>
     * 新增评分规则<br>
     *
     * @param  classId 班级id
     * @param proportions  评分规则
     * @return 修改的行数
     */
    Integer updateScoreRuleById(@Param("classId") BigInteger classId, @Param("proportions") ClassInfo proportions);


    /**
     * 新建班级.
     * <p>
     * 根据教师id和课程id新建班级<br>
     * TODO:完成该mapper
     * @param userId  教师id
     * @param courseId 课程id
     * @return classId 班级Id
     */
    Integer insertClassById(BigInteger userId, BigInteger courseId);

    /**
     * 根据班级id删除该班级
     *
     * @param classId
     * @return
     */
    Integer deleteClassById(@Param("classId") BigInteger classId);

    /**
     * 判断某个course是否存在
     *
     * @param courseId
     * @return 存在返回1，否则返回0
     */
    Integer countCourseByCourseId(@Param("courseId") BigInteger courseId);

    /**
     * 判断某个class是否存在
     *
     * @param classId
     * @return 存在返回1，否则返回0
     */
    Integer countClassByClassId(@Param("classId") BigInteger classId);

    /**
     * 根据课程名称取得所有课程
     * @param courseName
     * @return
     */
    List<Course> listCourseByCourseName(@Param("courseName") String courseName)
}
