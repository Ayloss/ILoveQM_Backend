package xmu.crms.service;

import xmu.crms.entity.School;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author status200
 * @date 2017/12/19
 */

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
