package xmu.crms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 * @author status200
 * @date 2017/12/1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GpsDTO {
    private BigDecimal longitude;
    private BigDecimal latitude;
    private BigDecimal elevation;
}
