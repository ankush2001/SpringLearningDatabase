package com.ankush.customercurdapp.repo;

import com.ankush.customercurdapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CustomerRepository extends JpaRepository<Customer, Long> {
    // This interface extends JpaRepository, which provides methods for CRUD operations.
    // The first parameter is the entity type (Customer), and the second parameter is the type of the entity's ID (Long).
    // No additional methods are needed here unless you want to define custom queries.
    // JpaRepository provides methods like save(), findById(), findAll(), deleteById(), etc.
}
