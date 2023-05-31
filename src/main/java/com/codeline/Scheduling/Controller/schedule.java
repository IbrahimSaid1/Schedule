package com.codeline.Scheduling.Controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class schedule {

    @Scheduled(cron = "* 30 3 * * 2-5")
    public void scheuldeTask(){
        System.out.print("Hello Word");
    }
}
