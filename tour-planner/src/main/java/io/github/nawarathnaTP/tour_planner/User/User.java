package io.github.nawarathnaTP.tour_planner.User;

import io.github.nawarathnaTP.tour_planner.Model.BaseEntity;
import io.github.nawarathnaTP.tour_planner.Model.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

//JWA annotations
@Entity
@Table(name="Users")
//Lombok annotations
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class User extends BaseEntity implements UserDetails {

    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @Enumerated(EnumType.STRING)
    private AccStatus status;

    public User(String userName, String password, UserRole role, AccStatus status){
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.status = status;
    }



}
