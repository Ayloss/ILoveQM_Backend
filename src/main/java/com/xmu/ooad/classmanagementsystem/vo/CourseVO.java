package com.xmu.ooad.classmanagementsystem.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 *
 * @author status200
 * @date 2017/11/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CourseVO {

    private BigInteger id;
    private String name;
    private String description;
    private String teacherName;
    private String teacherEmail;
    private Integer numClass;
    private Integer numStudent;
    private String startTime;
    private String endTime;
}
