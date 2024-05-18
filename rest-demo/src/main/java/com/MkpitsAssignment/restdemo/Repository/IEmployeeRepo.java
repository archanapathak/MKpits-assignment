package com.MkpitsAssignment.restdemo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.MkpitsAssignment.restdemo.model.Employee;



@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {

}