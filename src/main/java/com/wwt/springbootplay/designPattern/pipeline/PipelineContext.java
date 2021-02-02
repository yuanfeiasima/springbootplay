package com.wwt.springbootplay.designPattern.pipeline;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 定义管道处理的上下文
 * @author wangwentao09
 * @date 2021-02-02 16:44
 * @desc
 */
@Getter
@Setter
public class PipelineContext {
    /**
     * 处理开始时间
     */
    private LocalDateTime startTime;

    /**
     * 处理结束时间
     */
    private LocalDateTime endTime;

    /**
     * 获取数据名称
     */
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
