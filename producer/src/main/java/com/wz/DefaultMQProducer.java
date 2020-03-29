package com.wz;

import com.wz.message.Message;

/**
 * @Description: 生产者实现类
 * @Author: wz
 * @Date: 2020-03-29
 */
public class DefaultMQProducer implements MQProducer{

    private ServiceState serviceState = ServiceState.CREATE_JUST;
    /**
     * 消息组
     */
    private String producerGroup;

    public DefaultMQProducer(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    @Override
    public void start() {
        switch (this.serviceState) {
            case CREATE_JUST:
                this.serviceState = ServiceState.START_FAILED;
        }
    }

    @Override
    public void shutdown() {

    }

    @Override
    public SendResult send(Message message) throws Exception {
        return null;
    }

}
