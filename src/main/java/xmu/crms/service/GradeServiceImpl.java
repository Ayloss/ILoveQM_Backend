package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by status200 on 2017/12/19.
 */
public class GradeServiceImpl implements GradeService {
    @Override
    public Boolean deleteStudentScoreGroupByTopicId(BigInteger topicId) {
        return null;
    }

    @Override
    public List<BigInteger> listSeminarGradeBySeminarGroupId(BigInteger userId, BigInteger seminarGroupId) {
        return null;
    }

    @Override
    public Boolean insertGroupGradeByUserId(BigInteger userId, BigInteger seminarId, BigInteger groupId, BigInteger grade) {
        return null;
    }

    @Override
    public Boolean updateGroupByGroupId(BigInteger seminarGroupId, BigInteger grade) {
        return null;
    }

    @Override
    public List<BigInteger> listSeminarGradeByStudentId(BigInteger userId) {
        return null;
    }
}
