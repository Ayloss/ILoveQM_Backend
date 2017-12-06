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
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeminarVO {
    private BigInteger id;
    private String name;
    private String courseName;
    private String description;
    private String groupingMethod;
    private String startTime;
    private String endTime;
    private String site;
    private String teacherName;
    private String teacherEmail;
    private Integer grade;
    private List<ClassVO> classes;
    private Integer classCalling;
    private Boolean isLeader;
    private Boolean areTopicsSelected;
}
