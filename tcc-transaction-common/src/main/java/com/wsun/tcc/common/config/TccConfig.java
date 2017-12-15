package com.wsun.tcc.common.config;

import lombok.Data;

@Data
public class TccConfig {

    private String appName;

    private String serializer = "hession";

    /**
     * 回滚队列大小
     */
    private int coordinatorQueueMax = 5000;

    /**
     * 监听回滚队列线程数
     */
    private int coordinatorThreadMax = Runtime.getRuntime().availableProcessors() << 1;

    /**
     * 任务调度线程大小
     */
    private int scheduledThreadMax = Runtime.getRuntime().availableProcessors() << 1;


    /**
     * 调度时间间隔 单位:秒
     */
    private int scheduledDelay = 60;

    /**
     * 最大重试次数
     */
    private int retryTimes = 3;


    /**
     * 线程池的拒绝策略
     */
    private String rejectPolicy = "Abort";

    /**
     * 线程池的队列类型
     */
    private String blockingQueueType = "Linked";
}
