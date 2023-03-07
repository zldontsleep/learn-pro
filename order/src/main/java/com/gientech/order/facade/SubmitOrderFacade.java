package com.gientech.order.facade;

import com.gientech.order.entity.OrderInfo;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 16:03
 * @Description: com.gientech.order.facade
 * @version: 1.0
 */
public interface SubmitOrderFacade {
    public String submitOrder(OrderInfo orderInfo);
}
