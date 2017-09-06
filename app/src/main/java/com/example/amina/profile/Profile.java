package com.example.amina.profile;

/**
 * Created by amina on 06.09.17.
 */

public class Profile {
    private String name;
    private String lastname;
    private String number;
    private String email;
    private String address;


    public Profile(String name, String surname, String number,
                   String email, String address) {
        this.name = name;
        this.lastname = surname;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return lastname;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }


    public String getAddress() {
        return address;
    }
}