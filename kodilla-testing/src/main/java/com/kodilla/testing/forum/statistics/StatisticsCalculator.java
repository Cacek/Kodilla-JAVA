package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator  {

    Statistics statistics;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }
    int usersQty;
    int postsQty;
    int commentsQty;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        commentsQty = statistics.usersNames().size();
        postsQty = statistics.postsCount();
        commentsQty = statistics.commentsCount();
        avgPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        avgCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        avgCommentsPerPost = statistics.commentsCount() / statistics.postsCount();

    }

    public int getUsersQty() {
        return usersQty;
    }

    public void setUsersQty(int usersQty) {
        this.usersQty = usersQty;
    }

    public int getPostsQty() {
        return postsQty;
    }

    public void setPostsQty(int postsQty) {
        this.postsQty = postsQty;
    }

    public int getCommentsQty() {
        return commentsQty;
    }

    public void setCommentsQty(int commentsQty) {
        this.commentsQty = commentsQty;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public void setAvgPostsPerUser(double avgPostsPerUser) {
        this.avgPostsPerUser = avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public void setAvgCommentsPerUser(double avgCommentsPerUser) {
        this.avgCommentsPerUser = avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void setAvgCommentsPerPost(double avgCommentsPerPost) {
        this.avgCommentsPerPost = avgCommentsPerPost;
    }
}
