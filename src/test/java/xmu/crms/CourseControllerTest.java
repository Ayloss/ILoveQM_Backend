package xmu.crms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 课程相关 API 测试
 * url-pattern: prefix="/course"
 *
 * @author LuLongfei
 * @date 2017-12-3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CourseControllerTest {
    @Autowired
    private MockMvc mvc;

    /**
     * 获取课程列表测试
     * url: /course
     * httpMethod: GET
     *
     * @throws Exception
     */
    @Test
    public void selectCourses() throws Exception {
        mvc
                .perform(get("/course"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0]").exists())
                .andExpect(jsonPath("$[0].id").isNumber())
                .andExpect(jsonPath("$[0].name").isString())
                .andDo(print());
    }


    /**
     * 获取课程详细信息测试
     * url: /course/{courseId}
     * httpMethod: GET
     *
     * @throws Exception
     */
    @Test
    public void selectCourse() throws Exception {
        Long courseId = 5L;
        mvc
                .perform(get("/course/{courseId}", courseId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.name").isString())
                .andExpect(jsonPath("$.description").isString())
                .andExpect(jsonPath("$.teacherName").isString())
                .andExpect(jsonPath("$.teacherEmail").isString())
                .andDo(print());
    }


    /**
     * 获取课程班级列表测试
     * url: /course/{courseId}/class
     * httpMethod: GET
     *
     * @throws Exception
     */
    @Test
    public void selectClassesByCourse() throws Exception {
        mvc
                .perform(get("/course/{courseId}/class", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0]").exists())
                .andExpect(jsonPath("$[0].id").isNumber())
                .andExpect(jsonPath("$[0].name").isString())
                .andDo(print());
    }


    /**
     * 获取课程讨论课列表测试
     * url: /course/{courseId}/seminar
     * httpMethod: GET
     *
     * @throws Exception
     */
    @Test
    public void selectSeminarsByCourse() throws Exception {
        mvc
                .perform(get("/course/{courseId}/seminar", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0]").exists())
                .andExpect(jsonPath("$[0].id").isNumber())
                .andExpect(jsonPath("$[0].name").isString())
                .andExpect(jsonPath("$[0].description").isString())
                .andExpect(jsonPath("$[0].groupingMethod").isString())
                .andExpect(jsonPath("$[0].startTime").isString())
                .andExpect(jsonPath("$[0].endTime").isString())
                .andDo(print());
    }



    /**
     * 获取课程正在进行的讨论课测试
     * url: /course/{courseId}/seminar/current
     * httpMethod: GET
     *
     * @throws Exception
     */
    @Test
    public void selectCurrentSeminar() throws Exception {
        mvc
                .perform(get("/course/{courseId}/seminar/current", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.name").isString())
                .andExpect(jsonPath("$.groupingMethod").isString())
                .andExpect(jsonPath("$.startTime").isString())
                .andExpect(jsonPath("$.endTime").isString())
                .andExpect(jsonPath("$.classes").isArray())
                .andDo(print());
    }



}
