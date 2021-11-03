package org.fashionshop.fashionshop.customer.model;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @NotEmpty
    @Column(name="first-name",nullable = false)
    private String firstname;
    @NotEmpty
    @Column(name="last-name",nullable = false)
    private String lastName;
    @NotNull
    @Column(name="email",nullable=false,unique = true)
    private String email;
    @NotNull
    @Size(min = 5)
    @Column(name="password",nullable=false)
    private String password;

    @Embedded
    private Address address;


}
