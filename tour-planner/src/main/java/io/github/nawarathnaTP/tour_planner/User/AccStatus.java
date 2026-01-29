package io.github.nawarathnaTP.tour_planner.User;

public enum AccStatus {
    ACTIVE("active"),
    PENDING("pending"),
    SUSPENDED("suspended");

    private String status;

    AccStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
