package xmu.crms.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.entity.FixGroup;

/**
 * @author LiuXin
 * @date 2017/12/22 17:18
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FixGroupMapperTest {
    @Autowired
    private FixGroupMapper fixGroupMapper;

    private static Log log = LogFactory.getLog(FixGroupMapper.class);
    @Test
    public void testInsertFixGroupByClassId() throws Exception{
        FixGroup group;
        group
    }
}
