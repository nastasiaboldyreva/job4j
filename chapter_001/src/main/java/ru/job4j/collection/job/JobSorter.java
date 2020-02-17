package ru.job4j.collection.job;

import ru.job4j.collection.job.Job;
import ru.job4j.collection.job.JobDescByName;
import ru.job4j.collection.job.JobDescByPriority;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );

        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
    }
}

