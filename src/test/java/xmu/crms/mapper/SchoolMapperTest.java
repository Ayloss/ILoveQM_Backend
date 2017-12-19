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
 * Created by status200 on 2017/12/19.
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
    public void testListAll() throws Exception {
        List<School> list = schoolMapper.listAll();

        log.info(list);
        log.info(list.size());
    }

    @Test
    public void testGetSchoolBySchoolId() throws Exception {
        School school = schoolMapper.getSchoolBySchoolId(new BigInteger("2"));

        log.info(school);
    }
}
