package com.vampire.eventall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName : CommonAppEvent
 * @Description : 自定义消息类
 * @Author : pw
 * @Date: 2020-09-30 13:34
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonAppEvent<T> {
    /**
     * 事件类型
     */
    private  IEventType iEventType;

    /**
     * 事件携带的数据
     */
    private T data;
}
