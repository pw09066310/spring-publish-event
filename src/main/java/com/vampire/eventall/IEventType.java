/******************************************************************
 * IIMessageType.java
 * Copyright 2017 by CEIEC Company. All Rights Reserved.
 * CreateDate：2017年9月4日
 * Author：NieLixiang
 * Version：1.0.0
 ******************************************************************/

package com.vampire.eventall;


public interface IEventType {

    /**
     * 获取消息码
     * @return
     */
	int getCode();

    /**
     * 获取消息内容
     * @return
     */
	String getContent();


}
