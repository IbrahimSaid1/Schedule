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
    @Scheduled(cron = "0 0/5 * 1-10 1 * ?")
    @Scheduled(cron = "0 30 16 ? 7,8 *")
    @Scheduled(cron = "0 0 0 1 1,4,7,10 ?")
    @Scheduled(cron = "0 0 8 1-30 * ?")
    @Scheduled(cron = "0 0 22-23,0-6/2 * * ?")
    @Scheduled(cron = "0 30 13 ? * 6")
    @Scheduled(cron = "0 30 13 ? * 6")
    @Scheduled(cron = "0 30 17 1 * ?")
    @Scheduled(cron = "0 0 3 ? 11 *")
    @Scheduled(cron = "0 0/10 9-17 ? * *")




    public void scheuldeTask(){
        System.out.print("Hello Word");
    }
}
