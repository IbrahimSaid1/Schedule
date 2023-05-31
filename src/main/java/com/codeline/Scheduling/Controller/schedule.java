package com.codeline.Scheduling.Controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class schedule {

    @Scheduled(cron = "0 0 3 1 * *")
    public void scheuldeTask(){
        System.out.print("Hello Word");
    }
}
