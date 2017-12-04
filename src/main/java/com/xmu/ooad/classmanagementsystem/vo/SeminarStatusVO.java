package com.xmu.ooad.classmanagementsystem.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author status200
 * @date 2017/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeminarStatusVO {

    private Integer numPresent;
    private Integer numStudent;
    private String status;
    private String group;
}
