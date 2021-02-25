package com.wwt.springbootplay.designPattern.pipeline;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author wangwentao09
 * @date 2021-02-02 17:16
 * @desc
 */
@Component
public class ThreadPoolConfig {

    @Bean
    public ThreadPoolTaskExecutor getPipelineThreadPool() {
        ThreadPoolTaskExecutor pipelineThreadPool = new ThreadPoolTaskExecutor();
//        核心线程数
        pipelineThreadPool.setCorePoolSize(4);
//        最大线程数
        pipelineThreadPool.setMaxPoolSize(8);
//        线程最大空闲时间/秒（根据管道使用情况指定）
        pipelineThreadPool.setKeepAliveSeconds(100);
//        任务队列大小（根据管道使用情况指定）
        pipelineThreadPool.setQueueCapacity(256);
//        线程名称前缀
        pipelineThreadPool.setThreadNamePrefix("pipelineThreadPool");
//        拒绝策略
        pipelineThreadPool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//        pipelineThreadPool.setTaskDecorator();
//        pipelineThreadPool.setThreadFactory();
//        pipelineThreadPool.setAllowCoreThreadTimeOut();
//        pipelineThreadPool.setWaitForTasksToCompleteOnShutdown();
//        pipelineThreadPool.setAwaitTerminationSeconds();
//        pipelineThreadPool.setBeanName();
//        pipelineThreadPool.setThreadNamePrefix();
//        pipelineThreadPool.setThreadPriority();
//        pipelineThreadPool.setDaemon();
//        pipelineThreadPool.setThreadGroupName();
//        pipelineThreadPool.setThreadGroup();

        return pipelineThreadPool;
    }
}
