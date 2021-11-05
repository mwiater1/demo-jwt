package dev.mwiater.demo.jwt.controller;

import dev.mwiater.demo.jwt.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

}
