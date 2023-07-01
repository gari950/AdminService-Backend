package com.example.admin.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String fname;
    private final String lname;
    private final String email;
    private final String password;


    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }
}
