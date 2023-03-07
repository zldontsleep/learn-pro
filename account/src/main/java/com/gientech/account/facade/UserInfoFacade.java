package com.gientech.account.facade;

import com.gientech.account.entity.UserInfoDto;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.IOException;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 15:26
 * @Description: com.gientech.account.facade
 * @version: 1.0
 */
public interface UserInfoFacade {
    public UserInfoDto findUserInfo(String userId);
    public void update(UserInfoDto userInfoDto) throws IOException, InterruptedException, RemotingException, MQClientException, MQBrokerException;
}
