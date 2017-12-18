package xmu.crms.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PresentVO {

    private Integer numPresent;
    private List<StudentVO> present;
    private List<StudentVO> late;
    private List<StudentVO> absent;
}
