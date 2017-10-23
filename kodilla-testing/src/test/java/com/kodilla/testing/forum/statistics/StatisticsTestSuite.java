package com.kodilla.testing.forum.statistics;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
                                                            //tu tworzymy obiekt Statistics np.
                                                            /*//public class JestemMockiem implements Statistics {
                                                            @Override
                                                            List<String> usersNames() {
                                                                return new ArrayList<>();
                                                            }
                                                            @Override
                                                            int postsCount() {
                                                                return 0;
                                                            }
                                                            @Override
                                                            int commentsCount() {
                                                                return 0;
                                                            }
                                                        }*/
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>());
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>());
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        statisticsCalculator.calculateAdvStatistics();

        //Then
         Assert.assertEquals(0,statisticsCalculator.avgCommentsPerPost, 0);
        Assert.assertEquals(0,statisticsCalculator.avgCommentsPerUser, 0);
        Assert.assertEquals(0,statisticsCalculator.avgPostsPerUser, 0);

    }

    @Test
    public void testCalculateAdvStatisticsNumbers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>());
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>());
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        statisticsCalculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0,statisticsCalculator.avgCommentsPerPost, 0);
        Assert.assertEquals(0,statisticsCalculator.avgCommentsPerUser, 0);
        Assert.assertEquals(0,statisticsCalculator.avgPostsPerUser, 0);

    }
}
