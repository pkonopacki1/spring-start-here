package com.konopackipio1.ch9scopessession;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.konopackipio1.ch9scopessession.services.LoggedUserManagementService;

import lombok.Getter;
import lombok.Setter;

@Component
@RequestScope
@Getter
@Setter
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private static final Map<String, String> credentials = new HashMap<>();

    private String username;
    private String password;

    static {
        credentials.put("Nathalie", "password");
    }

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login() {
        if (credentials.containsKey(username) && password.equals(credentials.get(username))) {
            loggedUserManagementService.setUsername(username);
            return true;
        }

        return false;
    }

}
