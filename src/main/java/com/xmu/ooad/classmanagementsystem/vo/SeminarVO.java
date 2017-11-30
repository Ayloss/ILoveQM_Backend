package com.xmu.ooad.classmanagementsystem.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 *
 * @author status200
 * @date 2017/11/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeminarVO {
    private BigInteger id;
    private String name;
    private String description;
    private String groupingMethod;
    private String startTime;
    private String endTime;
}
