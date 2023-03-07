package com.gientech.order.facade.impl;

import com.gientech.account.entity.UserInfoDto;
import com.gientech.account.facade.UserInfoFacade;
import com.gientech.order.entity.OrderInfo;
import com.gientech.order.facade.SubmitOrderFacade;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 16:06
 * @Description: com.gientech.order.facade.impl
 * @version: 1.0
 */
@Service
public class SubmitOrderFacadeImpl implements SubmitOrderFacade {
    @Reference
    private UserInfoFacade userInfoFacade;
    @Autowired
    RedisTemplate redisTemplate;
    @Override
    public String submitOrder(OrderInfo orderInfo) {
        //1.查询用户信息
        Object userInfo = redisTemplate.opsForValue().get("user-info:" + orderInfo.getUserId());
        if (userInfo == null) {
            //去数据库查询
        }
        //仍然为空，则直接rpc调用账户中心接口
        UserInfoDto userInfo1 = userInfoFacade.findUserInfo(orderInfo.getUserId());
        //2.校验用户信息
        //3.提交订单

        return "交易成功";
    }
}
