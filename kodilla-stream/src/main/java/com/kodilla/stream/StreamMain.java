package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

    Forum forum = new Forum();
    Map<Integer,ForumUser> theResultListOfUsers = forum.getUserList().stream()
            .filter(forumUser -> forumUser.getSex() == 'M')
            .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() >= 20 )
            .filter(forumUser -> forumUser.getPublishedPosts() >= 1)
            .collect(Collectors.toMap(ForumUser::getIdNumber,forumUser -> forumUser));

        System.out.println("# elements: " + theResultListOfUsers.entrySet().size());
        theResultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);

    }
}
