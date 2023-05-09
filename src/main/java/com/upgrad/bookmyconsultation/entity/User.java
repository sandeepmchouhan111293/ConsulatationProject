package com.upgrad.bookmyconsultation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


//Mark it with Data, Entity, Builder, NoArgsConstructor, AllArgsConstructor
//create a class named User
//create firstName of type String
//create lastName of type String
//create dob of type String
//create mobile of type String
//create primary key 'emailId' of type String
//create password of type String
//create createdDate of type String
//create salt of type String
//all the mentioned members must be private
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    //create firstName of type String
    private String firstName;
    //create lastName of type String
    private String lastName;
    //create dob of type String
    private String dob;
    //create mobile of type String
    private String mobile;
    //create primary key 'emailId' of type String
    @Id
    private String emailId;
    //create password of type String
    private String password;
    //create createdDate of type String
    private String createdDate;
    //create salt of type String
    private String salt;
    //all the mentioned members must be private
}