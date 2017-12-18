package xmu.crms.controller;

import xmu.crms.vo.UrlVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author status200
 * @date 2017/11/30
 */
@RestController
public class UploadController {

    @PostMapping("/upload/avatar")
    public ResponseEntity<UrlVO> updateAvatar(@RequestParam("file") MultipartFile file) {

        return new ResponseEntity<>(new UrlVO("/avatar/3486.png"), HttpStatus.CREATED);
    }


}
