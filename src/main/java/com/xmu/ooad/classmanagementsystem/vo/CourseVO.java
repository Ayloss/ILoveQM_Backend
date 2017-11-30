package com.xmu.ooad.classmanagementsystem.vo;

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
public class CourseVO {

    private BigInteger id;
    private String name;
    private String description;
}
