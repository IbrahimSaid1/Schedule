package com.codeline.Scheduling.Controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class schedule {

    @Scheduled(cron = "0 0 9-17 * * 0-4")
    public void scheuldeTask(){
        System.out.print("Hello Word");
    }
}
