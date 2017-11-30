package com.xmu.ooad.classmanagementsystem.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author status200
 * @date 2017/11/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupVO {

    private BigInteger id;
    private StudentVO leader;
    private List<StudentVO> members;
    private List<TopicVO> topics;
    private String report;
}
