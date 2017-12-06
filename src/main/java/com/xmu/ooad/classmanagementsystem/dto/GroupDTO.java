package com.xmu.ooad.classmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xmu.ooad.classmanagementsystem.vo.StudentVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author status200
 * @date 2017/12/1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupDTO {

    private BigInteger id;
    private StudentDTO leader;
    private List<StudentDTO> members;
    private List<TopicDTO> topics;
}
