package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class School {
	private BigInteger id;
	private String name;
	private String province;
	private String city;
		
}
