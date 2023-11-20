package com.springboot.omem.common.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CommonResponse<T> {
    private MessageResponse message;
    private T data;
    private boolean isSuccess;

    public static <T>CommonResponse<T> createSuccessData(T data) {
        return CommonResponse.<T>builder().data(data).isSuccess(true).build();
    }
}
