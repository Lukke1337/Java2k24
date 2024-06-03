package com.example;

import java.time.LocalDateTime;

public interface JobScheduler {

    JobScheduler forJob(Job jobWithdescription)

    JobScheduler startsAt(LocalDateTime start);

    JobScheduler everySeconds(int seconds);

    void repeatTimes(int i);
}
