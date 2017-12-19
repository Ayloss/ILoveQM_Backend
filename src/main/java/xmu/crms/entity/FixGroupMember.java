package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class FixGroupMember {
	private BigInteger id;
	private FixGroup fixGroup;
	private User student;


}
