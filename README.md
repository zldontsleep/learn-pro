# 下订单流程
1.用户下订单时，先查询订单系统的用户信息缓存是否存在
2.如果存在，则直接返回用户信息，并进行校验。如果不存在则查询订单系统数据库。
3.如果订单系统的数据库中也不存在，则通过远程RPC去用户系统查询。

# 用户信息同步流程
1.用户更新了信息后，用户系统先更新数据库再删除对应缓存，然后通过mq发布消息，使对应消费系统可以更新用户信息
2.订单系统收到消息后，先更新数据库，在更新缓存。
