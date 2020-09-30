package com.vampire.listener;

import com.vampire.eventall.CommonAppEvent;
import com.vampire.eventall.IDeptWokrEventListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName : SendMqToBankListener
 * @Description : 发送银行去放款
 * @Author : pw
 * @Date: 2020-09-30 14:38
 */
@Slf4j
@Component
public class SendMqToBankListener implements IDeptWokrEventListener {
    @Override
    public boolean supportsEventType(CommonAppEvent event) {
        return true;
    }

    @Override
    public void onApplicationEvent(CommonAppEvent event) {
        log.info("开始通知银行去放款={}",event);
    }
}
