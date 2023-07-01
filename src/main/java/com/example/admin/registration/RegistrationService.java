package com.example.admin.registration;

import com.example.admin.appuser.AppUser;
import com.example.admin.appuser.AppUserRole;
import com.example.admin.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private EmailValidator emailValidator;
    private final AppUserService appUserService;
    public String register(RegistrationRequest request) {
boolean isValidEmail = emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }

        return "works";
    }
}
