package com.example;

import java.time.LocalDateTime;

public class SimpleJobScheduler implements JobScheduler {

    private Job job;
    private LocalDateTime start;

    public JobScheduler forJob(Job job) {
        this.job = job;
        return null;
    }

    @Override
    public JobScheduler startsAt(LocalDateTime start) {
        this.start = start;
        return null;
    }

    @Override
    public JobScheduler everySeconds(int seconds) {
        return null;
    }

    @Override
    public void repeatTimes(int i) {

    }


}
