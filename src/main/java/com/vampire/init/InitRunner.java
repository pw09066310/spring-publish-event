package com.vampire.init;

import com.vampire.eventall.IDeptWokrEventListener;
import com.vampire.eventall.IDeptWokrEventListenerMultiCast;
import com.vampire.order.InOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

/**
 * @ClassName : InitRunner
 * @Description : 初始化一个，用于监听
 * @Author : pw
 * @Date: 2020-09-30 14:42
 */
@Component
@Slf4j
public class InitRunner implements CommandLineRunner,ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    private IDeptWokrEventListenerMultiCast iDeptWokrEventListenerMultiCast;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    /**
     * 这里将监听器 放到iDeptWokrEventListenerMultiCast 的有序集合里
     * 但是我们怎样将这些监听器按照我们指定的顺序有序的放到 这个集合里面？
     * 这个时候我们需要定义一个接口 专门用于标记这个listener执行顺序
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        Map<String, IDeptWokrEventListener> map = applicationContext.getBeansOfType(IDeptWokrEventListener.class);
        Collection<IDeptWokrEventListener> values = map.values();
        for(IDeptWokrEventListener deptWokrEventListener:values){
            log.info("register listener:{}",deptWokrEventListener);
            iDeptWokrEventListenerMultiCast.addApplicationListener(deptWokrEventListener);
        }
    }
}
