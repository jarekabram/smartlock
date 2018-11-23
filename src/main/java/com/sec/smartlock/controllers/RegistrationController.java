package com.sec.smartlock.controllers;

import com.sec.smartlock.models.DatabaseConnection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String getRegistration() {
        return "registration";
    }

    @PostMapping
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        DatabaseConnection dbconn = new DatabaseConnection();
        dbconn.insertData(name, email, password);
        response.getWriter().write("name");
//        return text;
    }
}
