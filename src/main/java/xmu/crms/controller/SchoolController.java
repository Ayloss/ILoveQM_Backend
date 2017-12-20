package xmu.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import xmu.crms.dto.SchoolDTO;
import xmu.crms.entity.School;
import xmu.crms.mapper.SchoolMapper;
import xmu.crms.vo.IdVO;
import xmu.crms.vo.SchoolVO;
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
    @Autowired
    private SchoolMapper schoolMapper;
    @GetMapping("/school")
    public ResponseEntity<List<SchoolVO>> getSchools(@RequestParam(value = "city",required = false) String city) {
        List<SchoolVO> list = new ArrayList<>();
        List<School> schools=schoolMapper.listSchoolByCity(city);
        for(School temp:schools){
            SchoolVO vo=new SchoolVO();
            vo.setId(temp.getId());
            vo.setCity(temp.getCity());
            vo.setName(temp.getName());
            vo.setProvince(temp.getProvince());
            list.add(vo);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @PostMapping("/school")
    public ResponseEntity<IdVO> createSchool(@RequestBody SchoolDTO dto) {
        School school=new School();
        school.setName(dto.getName());
        school.setProvince(dto.getProvince());
        school.setCity(dto.getCity());
        if(schoolMapper.insertSchool(school)) {
            return new ResponseEntity<IdVO>(new IdVO(school.getId()), HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<IdVO>(new IdVO(new BigInteger(String.valueOf(0))), HttpStatus.CREATED);
        }
    }

}
