package com.xmu.ooad.classmanagementsystem.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassVO {

    private BigInteger id;
    private String name;
    private Integer numStudent;
    private String time;
    private String site;
    private Integer calling;
    private String roster;
    private ClassProportionsVO proportions;
}
