package com.wwt.springbootplay.designPattern.pipeline;

import org.apache.tomcat.util.buf.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 处理器 - 输入数据校验：
 * @author wangwentao09
 * @date 2021-02-02 16:47
 * @desc
 */
@Component
public class InputDataPreChecker implements ContextHandler<InstanceBuildContext> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(InstanceBuildContext context) {
        logger.info("--输入数据校验--");

        Map<String, Object> formInput = context.getFormInput();

        if (formInput == null) {
            context.setErrorMsg("表单输入数据不能为空");
            return false;
        }

        String instanceName = (String) formInput.get("instanceName");

//        if (StringUtils.isBlank(instanceName)) {
        if ("".equals(instanceName)) {
            context.setErrorMsg("表单输入数据必须包含实例名称");
            return false;
        }

        return true;
    }
}
