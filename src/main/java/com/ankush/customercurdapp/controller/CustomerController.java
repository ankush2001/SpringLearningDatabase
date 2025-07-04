package com.ankush.customercurdapp.controller;

import com.ankush.customercurdapp.model.Customer;
import com.ankush.customercurdapp.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    // This class will handle HTTP requests related to customers.
    // It will contain methods to create, read, update, and delete customers.
    // Each method will be mapped to a specific HTTP request type (GET, POST, PUT, DELETE).
    // The methods will interact with the service layer to perform the required operations.

    // Autowired annotation is used to inject the CustomerRepository bean into this controller.
    @Autowired
    CustomerRepository customerService;

    // This Method will handle POST requests to create a new customer.
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        // Logic to create a customer and insert into the database
        return customerService.save(customer);
    }

    // This Method will handle PUT requests to update an existing customer.
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
        // Logic to retrieve a customer by ID from the database
        return customerService.findById(id)
                .map(customer -> ResponseEntity.ok().body(customer))
                .orElse(ResponseEntity.notFound().build());
    }
    // This Method will handle DELETE requests to delete a customer by ID.
    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        // Logic to retrieve all customers from the database
        List<Customer> customers = customerService.findAll();
        if (customers.isEmpty()) {
            return ResponseEntity.noContent().build();
            // Return 204 No Content if no customers found
        }
        return ResponseEntity.ok(customers); // Return 200 OK with the list of customers
    }
}
