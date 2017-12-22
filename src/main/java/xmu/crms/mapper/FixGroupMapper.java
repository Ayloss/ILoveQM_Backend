package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xmu.crms.entity.FixGroup;

import java.math.BigInteger;

/**
 * @author LiuXin
 * @date 2017/12/22 16:54
 */
@Mapper
@Component
public interface FixGroupMapper {
    /**
     * 按班级Id添加固定分组.
     * @param group 固定分组entity
     * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
     */
    BigInteger insertFixGroupByClassId(FixGroup group);

}
