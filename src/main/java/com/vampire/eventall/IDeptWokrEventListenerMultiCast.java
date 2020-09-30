package com.vampire.eventall;

/**
 * @ClassName : IDeptWokrEventListener
 * @Description : 自定义监听类 用于执行业务   参考spring的设计
 * @Author : pw
 * @Date: 2020-09-30 13:27
 */
public interface IDeptWokrEventListenerMultiCast {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(IDeptWokrEventListener<?> listener);



    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(IDeptWokrEventListener<?> listener);



    /**
     * Remove all listeners registered with this multicaster.
     * <p>After a remove call, the multicaster will perform no action
     * on event notification until new listeners are being registered.
     */
    void removeAllListeners();

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(CommonAppEvent event);
}
