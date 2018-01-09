package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    int usersQty;
    int postsQty;
    int commentsQty;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        usersQty = statistics.usersNames().size();
        postsQty = statistics.postsCount();
        commentsQty = statistics.commentsCount();

        //avgPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        if (usersQty == 0) {
            avgPostsPerUser = 0;
        } else {
            avgPostsPerUser = (double)postsQty / (double)usersQty;
        }

        //avgCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        if (usersQty == 0) {
            avgCommentsPerUser = 0;
        } else {
            avgCommentsPerUser = (double)commentsQty / (double)usersQty;
        }

        //avgCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        if (postsQty == 0) {
            avgCommentsPerPost = 0;
        } else {
            avgCommentsPerPost = (double)commentsQty / (double)postsQty;
        }

    }

}
