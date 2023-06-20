package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findByLastname(String lastname);
}
