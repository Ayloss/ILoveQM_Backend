package xmu.crms.service;

import xmu.crms.entity.FixGroup;
import xmu.crms.entity.FixGroupMember;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.User;
import xmu.crms.exception.ClassesNotFoundException;
import xmu.crms.exception.FixGroupNotFoundException;
import xmu.crms.exception.InvalidOperationException;
import xmu.crms.exception.UserNotFoundException;

import java.math.BigInteger;
import java.util.List;

/**
 * @author LiuXin
 * @date 2017/12/22 16:50
 */
public class FixGroupServiceImpl implements FixGroupService{
    @Override
    public BigInteger insertFixGroupByClassId(BigInteger classId, BigInteger userId) throws IllegalArgumentException, ClassesNotFoundException {
        return null;
    }

    @Override
    public void deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId) throws IllegalArgumentException, FixGroupNotFoundException {

    }

    @Override
    public BigInteger insertFixGroupMemberById(BigInteger userId, BigInteger groupId) throws FixGroupNotFoundException, UserNotFoundException, InvalidOperationException {
        return null;
    }

    @Override
    public List<User> listFixGroupMemberByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {
        return null;
    }

    @Override
    public List<FixGroup> listFixGroupByClassId(BigInteger classId) throws IllegalArgumentException {
        return null;
    }

    @Override
    public void deleteFixGroupByClassId(BigInteger classId) throws ClassesNotFoundException {

    }

    @Override
    public void deleteFixGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {

    }

    @Override
    public void updateFixGroupByGroupId(BigInteger groupId, FixGroup fixGroupBO) throws IllegalArgumentException, FixGroupNotFoundException {

    }

    @Override
    public List<FixGroupMember> getFixGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertStudentIntoGroup(BigInteger userId, BigInteger groupId) throws FixGroupNotFoundException, FixGroupNotFoundException, UserNotFoundException, InvalidOperationException {
        return null;
    }

    @Override
    public void deleteTopicByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {

    }

    @Override
    public FixGroup getFixedGroupById(BigInteger userId, BigInteger classId) throws IllegalArgumentException, ClassNotFoundException, UserNotFoundException {
        return null;
    }

    @Override
    public void updateSeminarGroupById(BigInteger groupId, SeminarGroup group) throws IllegalArgumentException, FixGroupNotFoundException {

    }

    @Override
    public void fixedGroupToSeminarGroup(BigInteger semianrId, BigInteger fixedGroupId) {

    }
}
