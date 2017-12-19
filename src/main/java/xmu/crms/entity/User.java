package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 35894
 */
@Data
@NoArgsConstructor
public class User {
	private BigInteger id;
	private String phone;
	private String wechatId;
	private String openid;
	private String avatar;
	private String password;
	private String name;
	private School school;
	private Integer gender;
	private Integer type;
	private String number;
	private Integer education;
	private Integer title;
	private String email;
	
}
