package com.example.databasegowala.repositories;

import com.example.databasegowala.model.GowallaTotalCheckinsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalCheckInRepository extends CrudRepository<GowallaTotalCheckinsEntity,Integer> {
}
