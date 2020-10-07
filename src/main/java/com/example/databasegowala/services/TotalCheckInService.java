package com.example.databasegowala.services;

import com.example.databasegowala.model.GowallaTotalCheckinsEntity;
import com.example.databasegowala.repositories.TotalCheckInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TotalCheckInService {

    private TotalCheckInRepository repository;
@Autowired
    public TotalCheckInService(TotalCheckInRepository repository) {
        this.repository = repository;
    }

    public Iterable<GowallaTotalCheckinsEntity> getAllTotalCheckIns()
    {
        return repository.findAll();
    }
}
