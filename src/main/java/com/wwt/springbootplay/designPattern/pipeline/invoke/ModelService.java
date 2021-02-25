package com.wwt.springbootplay.designPattern.pipeline.invoke;

import com.wwt.springbootplay.designPattern.pipeline.InstanceBuildContext;
import com.wwt.springbootplay.designPattern.pipeline.PipelineContext;
import com.wwt.springbootplay.designPattern.pipeline.PipelineExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * https://mp.weixin.qq.com/s?__biz=MzAxNDEwNjk5OQ==&mid=2650413430&idx=1&sn=32c89ea3222d341bf3014854f69fd239&chksm=8396d16eb4e1587838f99a6859668a3588b0762155c1a13872d3f419efa3f75c5a532d7d38fe&scene=21#wechat_redirect
 * @author wangwentao09
 * @date 2021-02-02 17:03
 * @desc
 */
@Service
public class ModelService {

    private final  Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PipelineExecutor pipelineExecutor;

    /**
     * 提交模型（构建模型实例）
     */
    public CommonResponse<Long> buildModelInstance(InstanceBuildRequest request) {
//        InstanceBuildContext data = createPipelineData(request);
        InstanceBuildContext data = new InstanceBuildContext();
//        同步调用
        boolean success = false;
//        boolean success = pipelineExecutor.acceptSync(data);
        List<Boolean> result = new ArrayList<>();
        //异步调用
        pipelineExecutor.acceptAsync(data, new BiConsumer<PipelineContext, Boolean>() {
            @Override
            public void accept(PipelineContext pipelineContext, Boolean aBoolean) {
                result.add(aBoolean);
            }
        });

        // 创建模型实例成功
        if (success) {
            return CommonResponse.success(data.getInstanceId());
        }

        logger.error("创建模式实例失败：{}", data.getErrorMsg());
        return CommonResponse.failed(data.getErrorMsg());
    }
}
