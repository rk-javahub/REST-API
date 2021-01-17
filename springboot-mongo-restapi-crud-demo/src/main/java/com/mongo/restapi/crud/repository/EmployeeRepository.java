package com.mongo.restapi.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.restapi.crud.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
