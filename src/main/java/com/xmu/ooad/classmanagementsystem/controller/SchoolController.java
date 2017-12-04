package com.xmu.ooad.classmanagementsystem.controller;

import com.xmu.ooad.classmanagementsystem.dto.SchoolDTO;
import com.xmu.ooad.classmanagementsystem.vo.IdVO;
import com.xmu.ooad.classmanagementsystem.vo.SchoolVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author status200
 * @date 2017/11/30
 */
@RestController
public class SchoolController {

    @GetMapping("/school")
    public ResponseEntity<List<SchoolVO>> getSchools(@RequestParam(value = "city",required = false) String city) {

        List<SchoolVO> list = new ArrayList<>();
        SchoolVO vo = new SchoolVO();
        vo.setId(new BigInteger("32"));
        vo.setName("厦门大学");
        vo.setProvince("福建");
        vo.setCity("厦门");
        list.add(vo);
        vo = new SchoolVO();
        vo.setId(new BigInteger("37"));
        vo.setName("厦门理工学院");
        vo.setProvince("福建");
        vo.setCity("厦门");
        list.add(vo);

        return new ResponseEntity<List<SchoolVO>>(list, HttpStatus.OK);
    }


    @PostMapping("/school")
    public ResponseEntity<IdVO> createSchool(@RequestBody SchoolDTO dto) {

        return new ResponseEntity<IdVO>(new IdVO(new BigInteger("38")), HttpStatus.CREATED);
    }

    @GetMapping("/school/province")
    public ResponseEntity<List<String>> getProvinces() {

        return new ResponseEntity<List<String>>(Arrays.asList("北京", "天津", "河北省", "澳门特别行政区"),HttpStatus.OK);
    }

    @GetMapping("/school/city")
    public ResponseEntity<List<String>> getCitysOfProvince(@RequestParam("province") String province) {

        return new ResponseEntity<List<String>>(Arrays.asList("北京", "天津", "河北省", "澳门特别行政区"),HttpStatus.OK);
    }
}
