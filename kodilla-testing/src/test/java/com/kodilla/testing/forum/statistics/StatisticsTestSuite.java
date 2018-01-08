package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsNumbers() {
        //Given
        Statistics calculateStatisticsMock = mock(Statistics.class);

        ArrayList<String> users = new ArrayList<>();
        users.add("Jan");
        users.add("Marian");
        users.add("Stanislaw");
        users.add("Ala");
        users.add("Kot");

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(calculateStatisticsMock);
        when(calculateStatisticsMock.usersNames()).thenReturn(users);
        when(calculateStatisticsMock.postsCount()).thenReturn(1000);
        when(calculateStatisticsMock.commentsCount()).thenReturn(100);


        //Then
        System.out.println(calculateStatisticsMock.usersNames().size());
        Assert.assertEquals(0,statisticsCalculator.avgCommentsPerPost, 0);
        Assert.assertEquals(0,statisticsCalculator.avgCommentsPerUser, 0);
        Assert.assertEquals(0,statisticsCalculator.avgPostsPerUser, 0);
        System.out.println(statisticsCalculator.commentsQty);
        System.out.println(statisticsCalculator.postsQty);
    }
}
