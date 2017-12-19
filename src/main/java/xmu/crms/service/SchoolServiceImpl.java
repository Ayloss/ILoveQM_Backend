package xmu.crms.service;

import org.springframework.stereotype.Service;
import xmu.crms.entity.School;

import java.math.BigInteger;
import java.util.List;

/**
 * service要加上一个@Service的注解，以便可以到处注入这个service
 *
 * @author status200
 * @date 2017/12/19
 */
@Service
public class SchoolServiceImpl implements SchoolService {
    @Override
    public List<School> listSchoolByCity(String city) {
        return null;
    }

    @Override
    public Boolean insertSchool(School school) {
        return null;
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
        return null;
    }
}
