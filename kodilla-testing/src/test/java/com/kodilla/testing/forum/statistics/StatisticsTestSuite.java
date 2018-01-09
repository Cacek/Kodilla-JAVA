package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    //Test
    //gdy liczba postów = 0
    //gdy liczba komentarzy = 0
    //gdy liczba użytkowników = 0
    @Test
    public void testCalculateAdvStatisticsNumbers_0() {
        //Given
        Statistics calculateStatisticsMock = mock(Statistics.class);

        //When
        when(calculateStatisticsMock.usersNames()).thenReturn(new ArrayList<String>());
        when(calculateStatisticsMock.postsCount()).thenReturn(0);
        when(calculateStatisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(calculateStatisticsMock);

        //Then
        System.out.println("Users:      " + statisticsCalculator.usersQty);
        System.out.println("Posts:      " + statisticsCalculator.postsQty);
        System.out.println("Comments:   " + statisticsCalculator.commentsQty);

        Assert.assertEquals(0,statisticsCalculator.avgCommentsPerPost, 0);
        Assert.assertEquals(0,statisticsCalculator.avgCommentsPerUser, 0);
        Assert.assertEquals(0,statisticsCalculator.avgPostsPerUser, 0);

    }

    //Test
    //gdy liczba postów = 1000
    //gdy liczba komentarzy < liczba postów
    //gdy liczba użytkowników = 100
    @Test
    public void testCalculateAdvStatisticsNumbersBiggerThen_0() {
        //Given
        Statistics calculateStatisticsMock = mock(Statistics.class);

        ArrayList<String> users = new ArrayList<>();
        for (int i=0; i <= 99; i++) {
            users.add("User " + i);
        }
        //When

        when(calculateStatisticsMock.usersNames()).thenReturn(users);
        when(calculateStatisticsMock.postsCount()).thenReturn(1000);
        when(calculateStatisticsMock.commentsCount()).thenReturn(500);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(calculateStatisticsMock);

        //Then
        System.out.println("Users:    " + statisticsCalculator.usersQty);
        System.out.println("Posts:    " + statisticsCalculator.postsQty);
        System.out.println("Comments: " + statisticsCalculator.commentsQty);

        Assert.assertEquals(0.5,statisticsCalculator.avgCommentsPerPost, 0);
        Assert.assertEquals(5,statisticsCalculator.avgCommentsPerUser, 0);
        Assert.assertEquals(10,statisticsCalculator.avgPostsPerUser, 0);

    }
    //Test
    //gdy liczba postów = 1000
    //gdy liczba komentarzy > liczba postów
    //gdy liczba użytkowników = 0
    @Test
    public void testCalculateAdvStatisticsNumbersBiggerThen_1() {
        //Given
        Statistics calculateStatisticsMock = mock(Statistics.class);
        //When

        when(calculateStatisticsMock.usersNames()).thenReturn(new ArrayList<String>());
        when(calculateStatisticsMock.postsCount()).thenReturn(1000);
        when(calculateStatisticsMock.commentsCount()).thenReturn(2000);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(calculateStatisticsMock);

        //Then
        System.out.println("Users:    " + statisticsCalculator.usersQty);
        System.out.println("Posts:    " + statisticsCalculator.postsQty);
        System.out.println("Comments: " + statisticsCalculator.commentsQty);

        Assert.assertEquals(2, statisticsCalculator.avgCommentsPerPost, 0);
        Assert.assertEquals(0, statisticsCalculator.avgCommentsPerUser, 0);
        Assert.assertEquals(0, statisticsCalculator.avgPostsPerUser, 0);
    }
}
