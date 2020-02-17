package ru.job4j.collection.job;

import org.junit.Test;
import ru.job4j.collection.job.Job;
import ru.job4j.collection.job.JobDescByName;
import ru.job4j.collection.job.JobDescByPriority;

import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
