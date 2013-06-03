package com.katzan.spring.furniturefronttest.model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class UserAccount {

	@NotEmpty
    private String firstName;
    private String lastName;

    private Date dateOfBirth;

    @Embedded
    @Valid
    private Address address = new Address();

    @NotEmpty
    @Email
    private String emailAddress;
    
    @NotEmpty
    private String phoneNumber;
    
    private String username;
   
    private String password;
}
