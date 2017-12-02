package com.xmu.ooad.classmanagementsystem.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class SeminarGradeVO {

    private List<PresentationGradeVO> presentationGrade;
    private Integer reportGrade;
    private Integer grade;
}
