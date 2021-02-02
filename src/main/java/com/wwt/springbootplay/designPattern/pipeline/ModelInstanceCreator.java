package com.wwt.springbootplay.designPattern.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 处理器 - 根据输入创建模型实例：
 * @author wangwentao09
 * @date 2021-02-02 16:52
 * @desc
 */
@Component
public class ModelInstanceCreator  implements ContextHandler<InstanceBuildContext> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(InstanceBuildContext context) {
        logger.info("--根据输入数据创建模型实例--");

        // 假装创建模型实例

        return true;
    }
}
