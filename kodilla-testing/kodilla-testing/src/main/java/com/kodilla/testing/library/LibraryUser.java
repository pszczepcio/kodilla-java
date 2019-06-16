package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstName;
    String lastName;
    String peselId;

    public LibraryUser(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(getFirstName(), that.getFirstName()) &&
                Objects.equals(getLastName(), that.getLastName()) &&
                Objects.equals(getPeselId(), that.getPeselId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPeselId());
    }

    @Override
    public String toString() {
        return "LibrarUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}