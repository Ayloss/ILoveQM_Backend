package com.xmu.ooad.classmanagementsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * URL-pattern:prefix="/class"
 *
 * @author ZDD、Huhui
 * @date 2017-12-04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ClassControllerTest {
    @Autowired
    private MockMvc mvc;

    /**
     * 获取班级列表测试
     * URL: /class
     * httpMethod: GET
     * @throws Exception
     */
    @Test
    public void testGetClassList() throws Exception{
        mvc.perform(get("/class"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0]").exists())
                .andExpect(jsonPath("$[0].id").isNumber())
                .andExpect(jsonPath("$[0].name").isString())
                .andExpect(jsonPath("$[0].numStudent").isNumber())
                .andExpect(jsonPath("$[0].time").isString())
                .andExpect(jsonPath("$[0].site").isString())
                .andExpect(jsonPath("$[0].courseName").isString())
                .andExpect(jsonPath("$[0].courseTeacher").isString())
                .andDo(print());
    }

    /**
     * 按ID获取班级详情测试
     * URL: /class/{classId}
     * httpMethod: GET
     * @throws Exception
     */
    @Test
    public void testGetClass() throws Exception{
        mvc.perform(get("/class/{classId}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.name").isString())
                .andExpect(jsonPath("$.numStudent").isNumber())
                .andExpect(jsonPath("$.time").isString())
                .andExpect(jsonPath("$.site").isString())
                .andExpect(jsonPath("$.calling").isNumber())
                .andExpect(jsonPath("$.roster").isString())
                .andExpect(jsonPath("$.proportions").isMap())
                .andDo(print());
    }

    /**
     * 按ID修改班级测试
     * URL: /class/{classId}
     * httpMethod: PUT
     * @throws Exception
     */
    @Test
    public void testUpdateClass() throws Exception {
        mvc.perform(put("/class/{classId}", 1)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\"name\": \"周三1-2节\", \"numStudent\": 120, \"time\": \"周三12节、周一34节\", \"site\": \"海韵201、公寓405\", \"calling\": -1, \"roster\": \"/roster/周三12班.xlsx\", \"proportions\": {\"report\": 50, \"presentation\": 50, \"c\": 20, \"b\": 60, \"a\": 20 }}".getBytes())
        )
                .andExpect(status().isNoContent())
                .andDo(print());
    }

    /**
     * 按ID获取自身所在班级小组测试
     * URL: /class/{classId}/classgroup
     * httpMethod: GET
     * @throws Exception
     */
    @Test
    public void testGetClassgroup() throws Exception {
        mvc.perform(get("/class/{classId}/classgroup", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.members").isArray())
                .andExpect(jsonPath("$.members[0]").exists())
                .andExpect(jsonPath("$.members[0].id").isNumber())
                .andExpect(jsonPath("$.members[0].name").isString())
                .andExpect(jsonPath("$.members[0].number").isString())
                .andDo(print());
    }



}
