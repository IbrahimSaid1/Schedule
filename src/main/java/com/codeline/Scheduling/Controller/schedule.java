package com.codeline.Scheduling.Controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class schedule {

    @Scheduled(cron = "* */5 9-18 * * 5,6")
    public void scheuldeTask(){
        System.out.print("Hello Word");
    }
}
