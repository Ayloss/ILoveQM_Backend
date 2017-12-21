package xmu.crms.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;

import javax.sound.sampled.Line;
import java.math.BigInteger;

/**
 * Created by status200 on 2017/12/20.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ClassMapperTest {

    @Autowired
    private ClassMapper classMapper;

    private static Log log = LogFactory.getLog(ClassMapperTest.class);

    @Test
    @Ignore
    public void testDeleteClassSelectionByClassId() throws Exception {

        classMapper.deleteCourseSelectionByClassId(new BigInteger("3"));

    }

    @Test
    @Ignore
    public void testGetClassByClassId() throws Exception {
        ClassInfo classInfo = classMapper.getClassByClassId(new BigInteger("2"));

        log.info(classInfo);

    }


    @Test
    @Ignore
    public void testUpdateClassByClassId() throws Exception {
        ClassInfo classInfo = new ClassInfo();

        classInfo.setId(new BigInteger("2"));
        classInfo.setName("名称");
        classInfo.setClassTime("12345");
        classInfo.setDescription("call ming");

        Course course = new Course();
        course.setId(new BigInteger("2"));

        classInfo.setCourse(course);
        classInfo.setThreePointPercentage(30);
        classInfo.setFourPointPercentage(50);
        classInfo.setFourPointPercentage(20);

        classInfo.setPresentationPercentage(40);
        classInfo.setReportPercentage(60);
        classInfo.setSite("fuck you 尻明");

        classMapper.updateClassByClassId(classInfo.getId(), classInfo);
    }

    @Test
    @Ignore
    public void testListClassByCourseId() throws Exception {

        log.info(classMapper.listClassByCourseId(new BigInteger("2")));
    }

    @Test
    @Ignore
    public void testInsertCourseSelectionById() throws Exception {
        log.info(classMapper.insertCourseSelectionById(new BigInteger("233"), new BigInteger("566")));
    }

    @Test
    @Ignore
    public void testDeleteCourseSelectionById() throws Exception {
        log.info(classMapper.deleteCourseSelectionByStudentIdAndClassId(new BigInteger("90"),new BigInteger("1")));
    }

    @Test
    @Ignore
    public void testDeleteScoreRuleById() throws Exception {
        log.info(classMapper.deleteScoreRuleById(new BigInteger("1")));
    }

    @Test
    @Ignore
    public void testGetScoreRule() throws Exception {
        classMapper.getScoreRuleByClassId(new BigInteger("2"));
    }

    @Test
    @Ignore
    public void testUpdateScoreRuleById() throws Exception {
        ClassInfo info = new ClassInfo();
        info.setPresentationPercentage(30);
        info.setReportPercentage(70);
        info.setThreePointPercentage(10);
        info.setFourPointPercentage(20);
        info.setFivePointPercentage(70);

        classMapper.updateScoreRuleById(new BigInteger("1"),info);
    }

    @Test
    public void testDeleteClassById() throws Exception {

        classMapper.deleteClassById(new BigInteger("3"));
    }

    @Test
    public void testCountCourseByCourseId() throws Exception {
        log.info(classMapper.countCourseByCourseId(new BigInteger("2")));
    }

    @Test
    public void testCountClassByClassId() throws Exception {
        log.info(classMapper.countClassByClassId(new BigInteger("1")));
    }
}
