package com.kodilla.patterns.strategy.social;

public class User {
    private String nameUser;
    protected SocialPublisher socialPublisher;

    public User(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String publischer(){
        return socialPublisher.share();
    }

    public void setSocialPublishert(SocialPublisher socialPublishert){
        this.socialPublisher = socialPublishert;
    }
}
