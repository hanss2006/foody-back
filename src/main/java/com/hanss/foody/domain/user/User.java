package com.hanss.foody.domain.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
@Data
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    @Column(length = 60)
    @JsonIgnore
    private String password;
    private boolean enabled;
    private boolean tokenExpired;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
}
