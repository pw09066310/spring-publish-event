package com.vampire.service.impl;

import com.vampire.eventall.CommonAppEvent;
import com.vampire.service.ExamineVerifyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName : ExamineVerifyServiceImpl
 * @Description : 更改融资状态服务类
 * @Author : pw
 * @Date: 2020-09-30 15:36
 */
@Service
@Slf4j
public class ExamineVerifyServiceImpl implements ExamineVerifyService {
    @Override
    public void changeFinancState(CommonAppEvent event) {
        log.info("更改融资状态结束={}",event);
    }
}
