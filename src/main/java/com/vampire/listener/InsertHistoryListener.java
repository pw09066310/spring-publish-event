package com.vampire.listener;

import com.vampire.eventall.CommonAppEvent;
import com.vampire.eventall.IDeptWokrEventListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName : InsertHistoryListener
 * @Description : 插入审核记录
 * @Author : pw
 * @Date: 2020-09-30 14:31
 */
@Component
@Slf4j
public class InsertHistoryListener implements IDeptWokrEventListener {
    @Override
    public boolean supportsEventType(CommonAppEvent event) {
        return true;
    }

    @Override
    public void onApplicationEvent(CommonAppEvent event) {
        log.info("开始插入审核记录={}",event);
    }
}
