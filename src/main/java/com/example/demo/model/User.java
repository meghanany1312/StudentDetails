package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="users")
public class User {

    private String name;
    private String email;
    private Integer phoneNo;
    @Id
    private Integer id;

}
