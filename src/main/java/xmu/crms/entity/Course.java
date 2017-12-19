package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class Course {
	private BigInteger id;
	private String name;
	private Date startDate;
	private Date endDate;
	private User teacher;
	private String description;
	private Integer reportPercentage;
	private Integer presentationPercentage;
	private Integer fivePointPercentage;
	private Integer fourPointPercentage;
	private Integer threePointPercentage;

}
