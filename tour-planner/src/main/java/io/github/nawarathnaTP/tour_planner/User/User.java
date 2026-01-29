package io.github.nawarathnaTP.tour_planner.User;

import io.github.nawarathnaTP.tour_planner.Model.Person;

public class User extends Person {

    private String userName;

    private String passwordHash;

    private Enum<Active, Suspended, Pending> status;

    private Enum<Guest, Guide, Admin> role;
    
}
