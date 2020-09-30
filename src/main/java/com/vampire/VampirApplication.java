package com.vampire;

import com.vampire.bean.FinishFinancDomain;
import com.vampire.eventall.CommonAppEvent;
import com.vampire.eventmsg.SystemEventType;
import com.vampire.service.WorkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : VampirApplication
 * @Description :
 * @Author : pw
 * @Date: 2020-09-30 13:15
 */
@SpringBootApplication
@Slf4j
@RestController
public class VampirApplication {

    @Resource
    private WorkService workService;


    @RequestMapping("tttt")
    public void examineFinanc(){
        CommonAppEvent event=new CommonAppEvent();
        FinishFinancDomain finishFinancDomain=new FinishFinancDomain();
        finishFinancDomain.setDesc("通过了2个亿的融资申请");
        finishFinancDomain.setId(2L);
        event.setData(finishFinancDomain);
        event.setIEventType(SystemEventType.FINISH_FINANC_APPEAL);
        workService.examineFinanc(event );
    }


    public static void main(String[] args) {
        new SpringApplicationBuilder(VampirApplication.class).web(WebApplicationType.SERVLET).run(args);
//        SpringApplication.run(VampirApplication.class,args);
    }
}
