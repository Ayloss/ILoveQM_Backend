package com.xmu.ooad.classmanagementsystem;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xmu.ooad.classmanagementsystem.controller.MeController;
import com.xmu.ooad.classmanagementsystem.dto.UserInfoDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigInteger;

/**
 * MeController测试类
 *
 * @author 艾星
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    /**
     * 测试getCurrentUser方法
     *
     * @throws Exception
     * @author 艾星
     */
    @Test
    public void testGetCurrentUser() throws Exception {
        //如果成功返回JSON数据
        this.mockMvc.perform(get("/me"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.type").isString())
                .andExpect(jsonPath("$.name").isString())
                .andExpect(jsonPath("$.phone").isString())
                .andExpect(jsonPath("$.email").isString())
                .andExpect(jsonPath("$.gender").isString())
                .andExpect(jsonPath("$.school").isMap())
                .andExpect(jsonPath("$.title").isString())
                .andExpect(jsonPath("$.avatar").isString());
    }

    /**
     * 测试updateCurrentUser方法更新用户信息是否成功
     *
     * @throws Exception
     * @author 艾星
     */
    @Test
    public void testUpdateCurrentUser() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        UserInfoDTO dto = new UserInfoDTO();
        dto.setId(new BigInteger("233"));
        dto.setName("张三");
        dto.setNumber("24320152202333");
        dto.setEmail("24320152202333@stu.xmu.edu.cn");
        dto.setGender("female");

        //如果成功返回204
        this.mockMvc.perform(put("/me")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(mapper.writeValueAsString(dto)))
                .andExpect(status().isNoContent());
    }

    /**
     * 测试signinWechat方法更新用户信息是否成功
     *
     * @throws Exception
     * @author 艾星
     */
    @Test
    public void testSigninWechat() throws Exception {
        //如果成功返回用户信息的JSON形式
        this.mockMvc.perform(get("/signin?code=ghjiugh&state=wrerfwe3er&success_url=student_index.html"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isNotEmpty())
                .andExpect(jsonPath("$.type").isString())
                .andExpect(jsonPath("$.name").isNotEmpty())
                .andExpect(jsonPath("$.jwt").isString());
    }


}
