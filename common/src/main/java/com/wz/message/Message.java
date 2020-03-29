package com.wz.message;

import java.io.Serializable;

/**
 * @ClassName: Message
 * @Description: 消息类
 * @Author: wz
 * @Date: 2020-03-29
 */
public class Message implements Serializable {
   private String topic;

   private byte[] body;

   public Message(){}

   public Message(String topic, byte[] body) {
      this.topic = topic;
      this.body = body;
   }
}
