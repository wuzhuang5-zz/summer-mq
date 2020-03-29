package com.wz.message;

import java.io.Serializable;

/**
 * @Description: 消息队列
 * @Author: wz
 * @Date: 2020-03-29
 */
public class MessageQueue implements Serializable {


    private String topic;
    private String brokerName;
    private int queueId;

    public MessageQueue() {

    }

    public MessageQueue(String topic, String brokerName, int queueId) {
        this.topic = topic;
        this.brokerName = brokerName;
        this.queueId = queueId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    @Override
    public String toString() {
        return "MessageQueue{" +
                "topic='" + topic + '\'' +
                ", brokerName='" + brokerName + '\'' +
                ", queueId=" + queueId +
                '}';
    }

}
