package xmu.crms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.sql.Date;

@Data
@NoArgsConstructor
public class School {

    private BigInteger id;
    private Date gmtCreate;
    private Date gmtModified;
    private String name;
    private String province;
    private String city;
}
