package com.vampire.service.impl;

import com.vampire.eventall.CommonAppEvent;
import com.vampire.eventall.CommonAppEventMultiCast;
import com.vampire.service.WorkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : WorkServiceImpl
 * @Description : 实现类
 * @Author : pw
 * @Date: 2020-09-30 15:06
 */
@Service
@Slf4j
public class WorkServiceImpl implements WorkService {
    @Autowired
    private CommonAppEventMultiCast commonAppEventMultiCast;

    @Override
    public void examineFinanc(CommonAppEvent event) {
        commonAppEventMultiCast.multicastEvent(event);
    }
}
