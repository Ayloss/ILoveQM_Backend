package xmu.crms.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<byte[]> getAvatar(HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.IMAGE_PNG_VALUE);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        ClassPathResource res = new ClassPathResource("static/avatar.png");
        return new ResponseEntity<>(IOUtils.toByteArray(res.getInputStream()), headers, HttpStatus.OK);
    }
}
