package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
public class CourseSelection {
	private BigInteger id;
	private ClassInfo classInfo;
	private User student;


}
