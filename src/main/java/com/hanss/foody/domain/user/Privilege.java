package com.hanss.foody.domain.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

//@Entity
//@Data
//@RequiredArgsConstructor
public class Privilege {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    @ManyToMany(mappedBy = "privileges")
//    private Collection<Role> roles;
}
