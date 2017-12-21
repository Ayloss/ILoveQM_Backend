package xmu.crms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.entity.School;
import xmu.crms.mapper.SchoolMapper;

import java.math.BigInteger;
import java.util.List;

/**
 * service要加上一个@Service的注解，以便可以到处注入这个service
 *
 * @author liuxin
 * @date 2017/12/19
 */
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;
    @Override
    public List<School> listSchoolByCity(String city) {
        return schoolMapper.listSchoolByCity(city);
    }

    @Override
    public BigInteger insertSchool(School school) {
        schoolMapper.insertSchool(school);
        return school.getId();
    }

    @Override
    public List<String> listProvince() {
        return null;
    }

    @Override
    public List<String> listCity(String province) {
        return null;
    }

    @Override
    public School getSchoolBySchoolId(BigInteger schoolId) {
        return schoolMapper.getSchoolBySchoolId(schoolId);
    }
}
