package com.gientech.account.facade.impl;

import com.gientech.account.entity.UserInfoDto;
import com.gientech.account.facade.UserInfoFacade;
import org.apache.dubbo.config.annotation.Service;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.MQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 15:28
 * @Description: com.gientech.account.facade.impl
 * @version: 1.0
 */
@Service
public class UserInfoFacadeImpl implements UserInfoFacade {
    @Resource
    private MQProducer producer;


    @Override
    public UserInfoDto findUserInfo(String userId) {
        //去数据查询信息返回用户信息 省略...
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUserId("123");
        userInfoDto.setUserName("zhangsan");
        return userInfoDto;
    }

    @Override
    public void update(UserInfoDto userInfoDto) throws IOException, InterruptedException, RemotingException, MQClientException, MQBrokerException {
        //1.数据库修改用户信息

        //2. 删除对应的缓存

        //3.发送mq消息
        Message message = new Message("user-info","user-info",userInfoDto.toString().getBytes());
        producer.send(message);
    }
}
