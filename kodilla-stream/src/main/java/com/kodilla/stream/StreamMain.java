package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Map<Integer, ForumUser> theUserList = Forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getBirthDate().getYear()+20 <= LocalDate.now().getYear())
                .filter(s -> s.getPosts() > 0)
                //.forEach(System.out::println);
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theUserList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}