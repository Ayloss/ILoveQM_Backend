package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;


@Data
@NoArgsConstructor
public class Seminar {
	private BigInteger id;
	private String name;
	private String description;
	private Course course;
	private Boolean fixed;
	private Date startTime;
	private Date endTime;
}
