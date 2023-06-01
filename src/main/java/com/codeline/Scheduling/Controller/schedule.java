package com.codeline.Scheduling.Controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class schedule {

    @Scheduled(cron = "0 0/5 * 1 * ?")
    @Scheduled(cron = "0 0 9-17 ? * *")
    @Scheduled(cron = "0 0/15 14-22 ? * 5,6")
    @Scheduled(cron = "0 0/10 8-15 ? * *")
    @Scheduled(cron = "0 0 23 * * *")
    @Scheduled(cron = "0 0/30 * 15,L * ?")
    @Scheduled(cron = "0 0 12 ? * 2#1")



    public void scheuldeTask(){
        System.out.print("Hello Word");
    }
}
