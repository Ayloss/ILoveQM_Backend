package com.xmu.ooad.classmanagementsystem.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 * @author status200
 * @date 2017/11/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PresentVO {

    private Integer numPresent;
    private List<PresentStudentVO> present;
}
