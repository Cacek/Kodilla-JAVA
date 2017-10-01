package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public static List<ForumUser> getUserList() {
            final List<ForumUser> UserList = new ArrayList<>();
            UserList.add(new ForumUser(1, "Ala", 'F', 1972, 6, 1, 10));
            UserList.add(new ForumUser(2, "Kasia", 'F', 1971, 1, 2, 19));
            UserList.add(new ForumUser(3, "Pawel", 'M', 1987, 3, 30, 0));
            UserList.add(new ForumUser(4, "Stefan", 'M', 1969, 4, 11, 8));
            UserList.add(new ForumUser(5, "Witek", 'M', 1992, 5, 19, 195));

            return new ArrayList<ForumUser>(UserList);
    }
}

