package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class Location {
	private BigInteger id;
	private ClassInfo classInfo;
	private Seminar seminar;
	private Double longitude;
	private Double latitude;
	private Integer status;

}
