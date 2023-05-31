package com.codeline.Scheduling.Controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class schedule {

    @Scheduled(cron = "* */5 * * * 0-4")
    @Scheduled(cron = "* */15 * * * 5,6")
    public void scheuldeTask(){
        System.out.print("Hello Word");
    }
}
