package xmu.crms.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.entity.School;

/**
 * @author liuxin
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolServiceTest {
    @Autowired
    private SchoolService schoolService;
    private static Log log = LogFactory.getLog(SchoolServiceTest.class);

    @Test
    public void testInsertSchool(){
        School school=new School();
        school.setName("南昌大学");
        school.setCity("南昌");
        school.setProvince("江西");
        log.info(schoolService.insertSchool(school));
    }
}
