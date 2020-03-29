package com.wz;

/**
 * 消息生产者
 */
public interface MQProducer {

    void start();

    void shutdown();

    void send(Message)
}
