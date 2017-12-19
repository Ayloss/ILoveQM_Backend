package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class SeminarGroupMember {
	private BigInteger id;
	private SeminarGroup seminarGroup;
	private User student;

}
