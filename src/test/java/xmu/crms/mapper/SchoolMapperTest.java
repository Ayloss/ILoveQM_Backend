package xmu.crms.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.entity.School;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by liuxin on 2017/12/19.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SchoolMapperTest {

    @Autowired
    private SchoolMapper schoolMapper;

    private static Log log = LogFactory.getLog(SchoolMapperTest.class);

    @Test
    public void testListSchoolByCity() throws Exception {
        List<School> list = schoolMapper.listSchoolByCity("天津");

        log.info(list);
        log.info(list.size());
    }
    @Test
    public void testInsertSchool() throws  Exception{
        School school=new School();
        school.setName("南昌大学");
        school.setCity("南昌");
        school.setProvince("江西");
        Boolean res = schoolMapper.insertSchool(school);

        log.info(res);
    }

    /*@Test
    public void testListProvince() throws Exception{
        List<String> list=schoolMapper.listProvince();

        log.info(list);
    }

    @Test
    public void testListCity() throws Exception{
        List<String> list=schoolMapper.listCity("江西");

        log.info(list);
    }*/


    @Test
    public void testGetSchoolBySchoolId() throws Exception {
        School school = schoolMapper.getSchoolBySchoolId(new BigInteger("2"));

        log.info(school);
    }
}
