package com.ankush.customercurdapp.model;

import jakarta.persistence.*;

// Entity means that this class is a JPA entity and will be mapped to a database table.
@Entity
@Table (name = "customers") //This annotation specifies the name of the table in the database.
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // This annotation specifies that the id field is the primary key and its value will be generated automatically.
    private Long id;
    private String name;
    private String email;
    private String phone;

    // Default constructor is required by JPA.
    public Customer() {
    }
    // Parameterized constructor to create a Customer object with specific values.
    public Customer(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
