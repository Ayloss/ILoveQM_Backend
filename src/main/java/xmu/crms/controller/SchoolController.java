package xmu.crms.controller;

import xmu.crms.dto.SchoolDTO;
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

        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @PostMapping("/school")
    public ResponseEntity<IdVO> createSchool(@RequestBody SchoolDTO dto) {

        return new ResponseEntity<IdVO>(new IdVO(new BigInteger("38")), HttpStatus.CREATED);
    }

    @GetMapping("/school/province")
    public ResponseEntity<List<String>> getProvinces() {

        return new ResponseEntity<>(Arrays.asList("北京", "天津", "河北", "澳门特别行政区"), HttpStatus.OK);
    }

    @GetMapping("/school/city")
    public ResponseEntity<List<String>> getCitysOfProvince(@RequestParam("province") String province) {

        return new ResponseEntity<>(Arrays.asList("北京市", "天津市", "河北省", "香港特别行政区","厦门市","泉州市","莆田市"), HttpStatus.OK);
    }
}
