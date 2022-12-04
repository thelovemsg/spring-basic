package catalogservice.catalogservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CatalogDto implements Serializable {

    private static final long serialVersionUID = 362498820763181265L;

    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
