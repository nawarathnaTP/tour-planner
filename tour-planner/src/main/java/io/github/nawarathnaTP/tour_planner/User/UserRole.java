package io.github.nawarathnaTP.tour_planner.User;

public enum UserRole {
    ADMIN("admin"),
    TOURIST("tourist"),
    GUIDE("guide");

    private String role;

    UserRole(String UserRole){
        this.role = UserRole;
    }

    public String getValue(){
        return this.role;
    }
}