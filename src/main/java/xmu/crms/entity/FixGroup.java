package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class FixGroup {
	private BigInteger id;
	private ClassInfo classInfo;
	private User leader;

}
