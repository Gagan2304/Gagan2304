package com.customerorders.RestCRUDapi.dao;

import com.customerorders.RestCRUDapi.method.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByName(String name);
    List<Customer> findAllByNameAndCountry(String name, String country);

}
