package com.xmu.ooad.classmanagementsystem.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 *
 * @author status200
 * @date 2017/12/1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PresentationGradeVO {

    private BigInteger topicId;
    private Integer grade;
}
