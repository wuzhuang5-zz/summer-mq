package com.wz;

/**
 * @Description: 服务状态枚举
 * @Author: wz
 * @Date: 2020-03-29
 */
public enum ServiceState {

    /**
     * 服务刚启动
     */
    CREATE_JUST,

    /**
     * 服务正在运行中
     */
    RUNNING,

    /**
     * 服务停止
     */
    SHUTDOWN,

    /**
     * 服务启动失败
     */
    START_FAILED;
}
