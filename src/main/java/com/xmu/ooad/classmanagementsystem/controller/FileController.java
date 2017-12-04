package com.xmu.ooad.classmanagementsystem.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author status200
 * @date 2017/12/4
 */
@Controller
public class FileController {

    @GetMapping(value = "/avatar/{fileName}")
    public void getAvatar(HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.IMAGE_PNG_VALUE);

//        IOUtils
    }
}
