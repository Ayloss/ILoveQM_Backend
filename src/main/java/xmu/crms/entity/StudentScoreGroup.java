package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class StudentScoreGroup {
	private BigInteger id;
	private User student;
	private SeminarGroupTopic seminarGroupTopic;
	private Integer grade;
	
}
