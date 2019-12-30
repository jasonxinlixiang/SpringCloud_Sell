package com.imooc.order.dto;

import lombok.Data;

@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;
}
