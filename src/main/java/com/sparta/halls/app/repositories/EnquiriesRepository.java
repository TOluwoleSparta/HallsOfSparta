package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.Enquiries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiriesRepository extends CrudRepository<Enquiries, Integer>{

}
