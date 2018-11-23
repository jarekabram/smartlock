package com.sec.smartlock;

import com.sec.smartlock.models.DatabaseConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        DatabaseConnection dbconnection = new DatabaseConnection();
        dbconnection.Init();
        SpringApplication.run(Main.class, args);
    }
}
