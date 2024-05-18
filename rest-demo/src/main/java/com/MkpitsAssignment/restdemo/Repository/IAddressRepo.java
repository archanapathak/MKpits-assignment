package com.MkpitsAssignment.restdemo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MkpitsAssignment.restdemo.model.Address;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Long> {

}