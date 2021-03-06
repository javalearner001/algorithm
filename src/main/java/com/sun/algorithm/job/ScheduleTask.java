package com.sun.algorithm.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunkai
 * @since 2021/11/25 11:08 上午
 */
@Slf4j
@Component
public class ScheduleTask {
    public static final String format = "yyyy-MM-dd HH:mm:ss";
    public static final SimpleDateFormat formatter = new SimpleDateFormat(format);

    @Scheduled(cron = "0/1 * * * * ?")
    public void printTest(){
        Date now = new Date();
        log.info("当前时间为：{}" , formatter.format(now));
    }
}
