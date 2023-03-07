package com.gientech.order.entity;

import lombok.Data;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 16:04
 * @Description: com.gientech.order.entity
 * @version: 1.0
 */
@Data
public class OrderInfo {
    private String orderId;
    private String orderType;
    private String userId;
    private String productId;
    private String productName;
}
