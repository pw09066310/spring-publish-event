package com.vampire.eventall;

import java.util.EventListener;

/**
 * @ClassName : IDeptWokrEventListener
 * @Description : 自定义监听类 用于执行业务
 * @Author : pw
 * @Date: 2020-09-30 13:27
 */
public interface IDeptWokrEventListener<E extends CommonAppEvent> extends EventListener{

    /**
     *
     * @param event
     * @return
     */
    boolean supportsEventType(E event );


    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
