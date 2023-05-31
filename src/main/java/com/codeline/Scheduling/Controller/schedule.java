package com.codeline.Scheduling.Controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class schedule {

    @Scheduled(cron = "0 0 22 ? 7-9 0")
    public void scheuldeTask(){
        System.out.print("Hello Word");
    }
}
