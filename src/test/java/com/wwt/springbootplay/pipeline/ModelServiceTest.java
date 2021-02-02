package com.wwt.springbootplay.pipeline;

import com.wwt.springbootplay.designPattern.pipeline.invoke.InstanceBuildRequest;
import com.wwt.springbootplay.designPattern.pipeline.invoke.ModelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangwentao09
 * @date 2021-02-02 17:09
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ModelServiceTest {

    @Autowired
    private ModelService modelService;


    @Test
    public void test() {
        InstanceBuildRequest request = new InstanceBuildRequest();
        modelService.buildModelInstance(request);
    }

}
