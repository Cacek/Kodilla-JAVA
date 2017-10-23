package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import static org.mockito.Mockito.mock;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.
    }
}
