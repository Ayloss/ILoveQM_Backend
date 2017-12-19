package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class ClassInfo {
	private BigInteger id;
	private String name;
	private Course course;
	private String site;
	private String classTime;
	private String description;
	private Integer reportPercentage;
	private Integer presentationPercentage;
	private Integer fivePointPercentage;
	private Integer fourPointPercentage;
	private Integer threePointPercentage;
}