package com.farmandosb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmandosb.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
List<Customer> findByFirstName(String FirstName);
List<Customer> findAll();
}