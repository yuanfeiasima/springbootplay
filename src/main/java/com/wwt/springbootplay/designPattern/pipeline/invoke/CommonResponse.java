package com.wwt.springbootplay.designPattern.pipeline.invoke;

import lombok.Data;

/**
 * @author wangwentao09
 * @date 2021-02-02 17:03
 * @desc
 */
@Data
public class CommonResponse<T> {

    private Long status;

    private String errorMsg;

    public static CommonResponse<Long> success(Long instanceId) {
        CommonResponse<Long> commonResponse = new CommonResponse<>();
        commonResponse.setStatus(0L);
        return commonResponse;
    }

    public static CommonResponse<Long> failed(String msg) {
        CommonResponse<Long> commonResponse = new CommonResponse<>();
        commonResponse.setStatus(400L);
        commonResponse.setErrorMsg(msg);
        return commonResponse;
    }
}
