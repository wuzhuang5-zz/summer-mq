package com.wz;

import com.wz.message.MessageQueue;

/**
 * 消息返回结果
 */
public class SendResult {
    /**
     * 发送状态
     */
    private SendStatus sendStatus;

    /**
     * 消息id
     */
    private String msgId;

    /**
     * 消息队列
     */
    private MessageQueue messageQueue;

    /**
     * 消息偏移量
     */
    private long queueOffset;
}
