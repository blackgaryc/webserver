package cn.edu.bdu.webserver.dataobject;

import cn.edu.bdu.webserver.enums.ProductStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.yaml.snakeyaml.util.EnumUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus= ProductStatusEnum.UP.getCode();
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
//    @JsonIgnore
//    public ProductStatusEnum getProductStatusEnum(){
//        return EnumUtils.getByCode(productStatus,ProductStatusEnum.class);
//    }
}
