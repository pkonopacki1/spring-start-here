package com.konopackipio1.ch9scopessession.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Getter;
import lombok.Setter;

@Service
@SessionScope
@Getter
@Setter
public class LoggedUserManagementService {

    private String username;

}
