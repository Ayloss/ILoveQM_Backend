package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class SeminarGroup {
	private BigInteger id;
	private Seminar seminar;
	private ClassInfo classInfo;
	private String report;
	private Integer reportGrade;
	private Integer presentationGrade;
	private Integer finalGrade;
	private User leader;

}
