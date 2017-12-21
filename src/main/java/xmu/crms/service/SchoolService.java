package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.School;

/**
 * 
 * @author LiuAiqi
 * @version 2.00
 *
 */
public interface SchoolService {
	/**
	 * 按城市名称查学校.
	 * <p>根据城市名称，查询出在该城市的所有学校<br>
	 * @author LiuAiqi
	 * @param city 城市名称
	 * @return list 学校列表
	 */
	 List<School> listSchoolByCity(String city);
	
	/**
	 * 添加学校.
	 * <p>根据学校详细的信息，添加相应学校<br>
	 * @author LiuAiqi
	 * @param school 学校的信息
	 * @return schoolId 添加的学校id
	 */
	 BigInteger insertSchool(School school);
	
	/**
	 * 获取学校信息.
	 * <p>根据学校id，获取该学校的所有信息<br>
	 * @author LiuAiqi
	 * @param schoolId 学校id
	 * @return SchoolBO 学校信息
	 */
	 School getSchoolBySchoolId(BigInteger schoolId);
}
