package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int publishedPosts;

    public ForumUser(final int idNumber,final String userName,final char sex,final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int publishedPosts) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.publishedPosts = publishedPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
