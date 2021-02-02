package com.wwt.springbootplay.designPattern.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 处理器 - 保存模型实例到相关DB表：
 * @author wangwentao09
 * @date 2021-02-02 16:53
 * @desc
 */
@Component
public class ModelInstanceSaver implements ContextHandler<InstanceBuildContext>{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(InstanceBuildContext context) {
        logger.info("--保存模型实例到相关DB表--");

        // 假装保存模型实例

        return true;
    }
}
