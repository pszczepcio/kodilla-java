package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser>  theListOfUsers = new ArrayList<>();

    public Forum() {
        theListOfUsers.add(new ForumUser(1,"Monika",'F',2005,1,29,100 ));
        theListOfUsers.add(new ForumUser(2,"Piotrek",'M',1999,2,3,101 ));
        theListOfUsers.add(new ForumUser(3,"Andrzej",'M',2005,3,5,120 ));
        theListOfUsers.add(new ForumUser(4,"Mariola",'F',1985,4,9,120 ));
        theListOfUsers.add(new ForumUser(5,"Maria",'F',1957,5,10,115));
        theListOfUsers.add(new ForumUser(6,"Krzysiek",'M',2000,6,11,200 ));
        theListOfUsers.add(new ForumUser(7,"Marek",'M',1957,7,12,300 ));
        theListOfUsers.add(new ForumUser(8,"Robert",'M',1987,8,13,0 ));
        theListOfUsers.add(new ForumUser(9,"Iwona",'F',1990,9,14,400 ));
        theListOfUsers.add(new ForumUser(10,"Danuta",'F',1960,10,15,150 ));
        theListOfUsers.add(new ForumUser(11,"Michał",'M',1986,11,17,100 ));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theListOfUsers);
    }
}
