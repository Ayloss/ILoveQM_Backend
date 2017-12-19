package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class Topic {
	private BigInteger id;
	private String name;
	private String description;
	private Integer groupNumberLimit;
	private Integer groupStudentLimit;
	private Seminar seminar;
	
}
