package com.vampire.eventall;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName :
 * @Description : 自定义消息类  提供增删 执行等方法
 * @Author : pw
 * @Date: 2020-09-30 13:34
 */
@Slf4j
@Component
public class CommonAppEventMultiCast implements IDeptWokrEventListenerMultiCast {
    public final Set<IDeptWokrEventListener<?>> applicationListeners = new LinkedHashSet<>();


    @Override
    public void addApplicationListener(IDeptWokrEventListener<?> listener) {
        applicationListeners.add(listener);
    }

    @Override
    public void removeApplicationListener(IDeptWokrEventListener<?> listener) {
        applicationListeners.remove(listener);
    }

    @Override
    public void removeAllListeners() {

    }

    /**
     * 遍历有序集合 linkedhashset  逐个执行要广播的内容
     * @param event the event to multicast
     */
    @Override
    public void multicastEvent(CommonAppEvent event) {
        for(IDeptWokrEventListener listener:applicationListeners){
            if(listener.supportsEventType(event)){
                listener.onApplicationEvent(event);
            }
        }
    }
}
