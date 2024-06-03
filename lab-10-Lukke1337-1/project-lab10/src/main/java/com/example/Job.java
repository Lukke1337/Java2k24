package com.example;

import java.time.LocalDateTime;

public interface Job {
    void run();
    public void setJobTime(LocalDateTime time);

    public LocalDateTime getJobTime();

    Job DescribedJob = new Job() {
        @Override
        public void run() {

        }

        @Override
        public void setJobTime(LocalDateTime time) {

        }

        @Override
        public LocalDateTime getJobTime() {
            return null;
        }
    }
}
