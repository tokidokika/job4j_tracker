package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    public void whenSortDescByName() {
        List<Job> jobs = Arrays.asList(new Job("Find new tools", 4),
                new Job("Fix bugs", 2),
                new Job("Do task", 2),
                new Job("Refactor", 1)
        );
        List<Job> expected = Arrays.asList(new Job("Refactor", 1),
                new Job("Fix bugs", 2),
                new Job("Find new tools", 4),
                new Job("Do task", 2)
        );
        jobs.sort(new JobDescByName());
        assertThat(expected).isEqualTo(jobs);
    }

    @Test
    public void whenSortAscByName() {
        List<Job> jobs = Arrays.asList(new Job("Find new tools", 4),
                new Job("Fix bugs", 3),
                new Job("Do task", 2),
                new Job("Refactor", 1)
        );
        List<Job> expected = Arrays.asList(new Job("Do task", 2),
                new Job("Find new tools", 4),
                new Job("Fix bugs", 3),
                new Job("Refactor", 1)
        );
        jobs.sort(new JobAscByName());
        assertThat(expected).isEqualTo(jobs);
    }

    @Test
    public void whenSortAscByPriority() {
        List<Job> jobs = Arrays.asList(new Job("Find new tools", 4),
                new Job("Fix bugs", 3),
                new Job("Do task", 2),
                new Job("Refactor", 1)
        );
        List<Job> expected = Arrays.asList(new Job("Refactor", 1),
                new Job("Do task", 2),
                new Job("Fix bugs", 3),
                new Job("Find new tools", 4)
        );
        jobs.sort(new JobAscByPriority());
        assertThat(expected).isEqualTo(jobs);
    }

    @Test
    public void whenSortDescByPriority() {
        List<Job> jobs = Arrays.asList(new Job("Do task", 2),
                new Job("Find new tools", 4),
                new Job("Refactor", 1),
                new Job("Fix bugs", 3)
        );
        List<Job> expected = Arrays.asList(new Job("Find new tools", 4),
                new Job("Fix bugs", 3),
                new Job("Do task", 2),
                new Job("Refactor", 1)
        );
        jobs.sort(new JobDescByPriority());
        assertThat(expected).isEqualTo(jobs);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> compareNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int result = compareNamePriority.compare(new Job("Refactor", 3),
                new Job("Refactor", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> comparePriorityName = new JobDescByPriority().thenComparing(new JobDescByName());
        int result = comparePriorityName.compare(new Job("Refactor", 1),
                new Job("Fix bugs", 3)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByAscPriorityName() {
        Comparator<Job> compareAsc = new JobAscByPriority().thenComparing(new JobAscByName());
        int result = compareAsc.compare(new Job("Refactor", 1),
                new Job("Fix bugs", 3));
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorAscNamePriority() {
        Comparator<Job> compareAscNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int result = compareAscNamePriority.compare(new Job("Refactor", 1),
                new Job("Fix bugs", 3));
        assertThat(result).isGreaterThan(0);
    }
}