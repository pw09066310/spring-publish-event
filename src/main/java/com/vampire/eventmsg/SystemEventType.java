package com.vampire.eventmsg;

import com.vampire.eventall.IEventType;

/**
 * @ClassName : SystemEventType
 * @Description : 消息体枚举类
 * @Author : pw
 * @Date: 2020-09-30 14:00
 */
public enum SystemEventType implements IEventType {

    FINISH_FINANC_APPEAL(3, "打款完成");

    private int code;

    private String content;
    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getContent() {
        return content;
    }

    SystemEventType(int code, String content) {
        this.code = code;
        this.content = content;
    }
}
