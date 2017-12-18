package xmu.crms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * UploadController测试类
 *
 * @author 艾星
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UploadControllerTest {
    @Autowired
    private MockMvc mockMvc;

    /**
     * 测试uploadAvatar方法
     *
     * @throws Exception
     * @author 艾星
     */
    @Test
    public void testUploadAvatar() throws Exception {

        mockMvc.perform(fileUpload("/upload/avatar")
                .file(new MockMultipartFile("file", "avatar.png", "image/png", "1123".getBytes()))
                .contentType(MediaType.MULTIPART_FORM_DATA))
                .andExpect(status().isCreated());
    }
    
    /*
    @Test
    public void testUploadClassRoster() throws Exception{
        //如果成功返回1个URL  
        this.mockMvc.perform(post("/upload/classroster"))
                        .andExpect(status().isOk())
                        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                        .andExpect(jsonPath("message").isString())
                        .andExpect(jsonPath("endPoint").isMap());
 
    }
    @Test
    public void testUploadReport() throws Exception{
        //如果成功返回1个URL  
        this.mockMvc.perform(post("/upload/report"))
                        .andExpect(status().isOk())
                        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                        .andExpect(jsonPath("message").isString())
                        .andExpect(jsonPath("endPoint").isMap());
    }
    */
}
