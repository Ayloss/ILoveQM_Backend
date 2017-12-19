package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class Attendance {
	private BigInteger id;
	private User student;
	private ClassInfo classInfo;
	private Seminar seminar;
	private Integer attendanceStatus;

	
}
