package com.example.databasegowala;

import com.example.databasegowala.model.GowallaTotalCheckinsEntity;
import com.example.databasegowala.services.TotalCheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabasegowalaApplication implements CommandLineRunner {
@Autowired
    private TotalCheckInService service;
    public static void main(String[] args) {
        SpringApplication.run(DatabasegowalaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

Iterable<GowallaTotalCheckinsEntity> entries=service.getAllTotalCheckIns();
int counter=0;
while(counter<5)
{
    GowallaTotalCheckinsEntity entry=entries.iterator().next();
    System.out.println(entry);
    counter++;
}

    }
}
