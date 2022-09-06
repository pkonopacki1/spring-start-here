package com.konopackipio1.ch9scopesrequest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Getter;
import lombok.Setter;

@Component
@RequestScope
@Getter
@Setter
public class LoginProcessor {

    private static Map<String, String> credentials = new HashMap<>();

    private String username;
    private String password;

    static {
        credentials.put("Nathalie", "password");
    }

    public boolean login() {
        if (credentials.containsKey(username)) {
            return password.equals(credentials.get(username));
        }

        return false;
    }

}
