package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class SeminarGroupTopic {
	private BigInteger id;
	private Topic topic;
	private SeminarGroup seminarGroup;
	private Integer presentationGrade;

}
