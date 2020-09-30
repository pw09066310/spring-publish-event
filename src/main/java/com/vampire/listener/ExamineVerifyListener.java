package com.vampire.listener;

import com.vampire.eventall.CommonAppEvent;
import com.vampire.eventall.IDeptWokrEventListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName : ExamineVerify
 * @Description : 审核该笔申请 更改改笔申请的状态
 * @Author : pw
 * @Date: 2020-09-30 14:27
 */
@Component
@Slf4j
public class ExamineVerifyListener implements IDeptWokrEventListener {
    @Override
    public boolean supportsEventType(CommonAppEvent event) {
        return true;
    }

    @Override
    public void onApplicationEvent(CommonAppEvent event) {
        log.info("开始审核申请={}",event);
    }
}
