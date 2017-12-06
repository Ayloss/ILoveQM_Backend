package com.xmu.ooad.classmanagementsystem;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

import net.minidev.json.parser.JSONParser;

/**
 * @author zimu
 * @date 12/03
 * @description:test controller of seminar resource
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SeminarControllerTest {

	@Autowired 
	private MockMvc mockMvc;
	
	/**
	 * 按ID获取讨论课
	 */
	@Test
	public void testGetSeminarById() throws Exception{
		mockMvc.perform(get("/seminar/32"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("id").exists())
				.andExpect(jsonPath("name").exists())
				.andExpect(jsonPath("startTime").exists())
				.andExpect(jsonPath("endTime").exists());
	}
	

	
	/**
	 * 按ID获取与学生有关的讨论课信息
	 * @throws Exception
	 */
	@Test
	public void testGetSeminarAboutStudentById() throws Exception{
		mockMvc.perform(get("/seminar/3/my"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("name").exists())
				.andExpect(jsonPath("courseName").exists())
				.andExpect(jsonPath("endTime").exists());
	}
	
	/**
	 * @param
	 * @throws Exception
	 * @description 按ID获取讨论课详情
	 */
	@Test
	public void testGetSeminarDetailById() throws Exception{
		mockMvc.perform(get("/seminar/3/detail"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("id").exists())
				.andExpect(jsonPath("name").exists())
				.andExpect(jsonPath("teacherName").exists());
	}
	
	/**
	 * @description 按ID获取讨论课的话题
	 */
	@Test
	public void testGetSeminarTopicById() throws Exception{
		mockMvc.perform(get("/seminar/3/topic"))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$[0].id").exists())
		       .andExpect(jsonPath("$[0].description").exists());	
	}

	
	/**
	 * @description 按讨论课ID查找小组
	 */
	@Test
	public void testGetGroupById() throws Exception{
		mockMvc.perform(get("/seminar/3/group"))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$[0].id").exists())
		       .andExpect(jsonPath("$[0].name").exists());
		
	}
	
	/**
	 * @description 按讨论课ID获取学生所在小组详情
	 */
	@Test
	public void testGetGroupDetailById() throws Exception{
		mockMvc.perform(get("/seminar/3/group/my"))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$.id").exists())
		       .andExpect(jsonPath("$.leader").exists())
				.andExpect(jsonPath("$.members").exists())
				.andExpect(jsonPath("$.topics").exists());

	}
	/**
	 * @description 按ID获取讨论课班级签到，分组状态
	 */
	@Test
	public void testGetAttendenceById() throws Exception{
		mockMvc.perform(get("/seminar/3/class/1/attendance"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("numPresent").exists())
				.andExpect(jsonPath("numStudent").exists())
				.andExpect(jsonPath("status").exists())
				.andExpect(jsonPath("group").exists());
	}
	/**
	 * @description 按ID获取讨论课班级已签到名单
	 */
	@Test
	public void testGetAttendenceListById() throws Exception{
		mockMvc.perform(get("/seminar/3/class/1/attendance"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.numPresent").exists())
				.andExpect(jsonPath("$.numStudent").exists())
				.andExpect(jsonPath("$.status").exists())
				.andExpect(jsonPath("$.group").exists());
	}
	
	/**
	 * @description 按ID获取讨论课班级迟到签到名单
	 */
	@Test
	public void testGetLateListById() throws Exception{
		mockMvc.perform(get("/seminar/3/class/1/attendance/late"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$[0].id").exists())
				.andExpect(jsonPath("$[0].name").exists());
	}
	
	/**
	 * @description 按ID获取讨论课班级缺勤名单
	 */
	@Test
	public void testGetAbsentListById() throws Exception{
		mockMvc.perform(get("/seminar/3/class/1/attendance/absent"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$[0].id").exists())
				.andExpect(jsonPath("$[0].name").exists());
	}
	
}
