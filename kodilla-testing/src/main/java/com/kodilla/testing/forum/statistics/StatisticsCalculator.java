package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    Statistics statistics;
    int usersQty;
    int postsQty;
    int commentsQty;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;
    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics() {
        commentsQty = statistics.usersNames().size();
        postsQty = statistics.postsCount();
        commentsQty = statistics.commentsCount();

        //avgPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        if (statistics.usersNames().size() == 0) {
            avgPostsPerUser = 0;
        } else {
            avgPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        }

        //avgCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        if (statistics.usersNames().size() == 0) {
            avgCommentsPerUser = 0;
        } else {
            avgCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }

        //avgCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        if (statistics.postsCount() == 0) {
            avgCommentsPerPost = 0;
        } else {
            avgCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        }

    }

}
