package com.wz;

import com.wz.message.Message;

/**
 * 消息生产者
 */
public interface MQProducer {

    void start();

    void shutdown();

//    void send(Message message) throws Exception;

    SendResult send(Message message) throws Exception;
}
