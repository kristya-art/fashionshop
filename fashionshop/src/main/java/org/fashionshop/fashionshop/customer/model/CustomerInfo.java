package org.fashionshop.fashionshop.customer.model;

public class CustomerInfo {

    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public Customer(long id, String firstName,String lastName, String email){
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }
    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
