

## Introduction
![summer-mq](https://raw.githubusercontent.com/wuzhuang5/summer-mq/master/common/src/main/resources/summermqlogo.png)

summer-mq is a lightweight distributed message queue framework With features of "horizontal expansion, high availability, massive data accumulation, single TPS over 100,000, millisecond delivery".
Support for "concurrent message, serial message, broadcast message, delay message, transaction message, failure retry, timeout control" and other message features. 
Now, it's already open source, real "out-of-the-box".

summer-mq是一款轻量级分布式消息队列，拥有 "水平扩展、高可用、海量数据堆积、单机TPS过10万、毫秒级投递" 等特性, 
支持 "并发消息、串行消息、广播消息、延迟消息、事务消费、失败重试、超时控制" 等消息特性。现已开放源代码，开箱即用。


## Documentation
- [中文文档]()


## Features
- 1、简单易用: 一行代码即可发布一条消息; 一行注解即可订阅一个消息主题;
- 2、轻量级: 部署简单，不依赖第三方服务，一分钟上手；
- 3、水平扩展：消息中心支持无限水平扩展，这里的水平扩展包括两方面：消息生产能力、消息消费能力；通过集群扩展线性提升消息吞吐能力；
- 4、高可用：消息中心能够忍受部分示例失效，不影响整个集群的可用性。通过内置注册中心可以实现秒级摘除失效节点，消息服务动态转移；
- 5、消息持久化：全部消息持久化存储，消息中心支持通过配置选择是否清理过期消息。
- 6、强数据安全：消息数据存储在DB中，可事务保障数据安全，防止消息数据丢失；
- 7、海量数据堆积：消息数据存储在DB中，支持千万级消息堆积；
- 8、单机TPS过10W：单机TPS受限于DB存储方式，选型 "MySQL" 时单机TPS过万，选型 "TIDB" 时单机TPS过10万；
- 9、毫秒级投递延迟：消息中心与客户端通过RPC的方式进行消息通讯，毫秒级延时；
- 10、多种消息模式: 
    - 并行消息：消息平均分配在该主题在线消费者，分片方式并行消费；适用于吞吐量较大的消息场景，如邮件发送、短信发送等业务逻辑
    - 串行消息：消息固定分配给该主题在线消费者中其中一个，FIFO方式串行消费；适用于严格限制并发的消息场景，如秒杀、抢单等排队业务逻辑；
    - 广播消息：消息将会广播发送给该主题在线消费者分组，全部分组都会消费该消息，但是一个分组下只会消费一次；适用于广播场景，如广播更新缓存等
- 11、延时消息: 支持设置消息的延迟生效时间, 到达设置的生效时间时该消息才会被消费；适用于延时消费场景，如订单超时取消等;
- 12、事务消费: 消费者开启事务开关后,消息事务性保证只会成功执行一次;
- 13、失败重试: 支持设置消息的重试次数, 在消息执行失败后将会按照设置的值进行消息重试执行,直至重试次数耗尽或者执行成功;
- 14、超时控制: 支持自定义消息超时时间，消息消费超时将会主动中断；
- 15、消息可见: 系统中每一条消息可通过Web界面在线查看,甚至支持编辑消息内容和消息状态;
- 16、消息可追踪: 支持追踪每一条消息的执行路径, 便于排查业务问题;
- 17、消息失败告警：支持以Topic粒度监控消息，存在失败消息时主动推送告警邮件；默认提供邮件方式失败告警，同时预留扩展接口，可方面的扩展短信、钉钉等告警方式；
- 18、容器化：提供官方docker镜像，并实时更新推送dockerhub，进一步实现产品开箱即用；
- 19、访问令牌（accessToken）：为提升系统安全性，消息中心和客户端进行安全性校验，双方AccessToken匹配才允许通讯；


## Communication

- [社区交流]()


## Contributing
Contributions are welcome! Open a pull request to fix a bug, or open an [Issue](https://github.com/wuzhuang5/summer-mq/issues) to discuss a new feature or change.

欢迎参与项目贡献！比如提交PR修复一个bug，或者新建 [Issue](https://github.com/wuzhuang5/summer-mq/issues) 讨论新特性或者变更。
