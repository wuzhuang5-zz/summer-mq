package com.wz;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @Author: wz
 */
public class SyncProducer {
    public static void main(String[] args) throws Exception{
        DefaultMQProducer producer = new DefaultMQProducer("生产组名");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        for (int i = 0; i < 100; i++) {
            Message message = new Message("topic", "tag", ("Hello World"+i).getBytes());
            SendResult result = producer.send(message);
            System.out.printf("%s%n", result);
        }
        producer.shutdown();
    }
}
