package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceProvider() {
    }

    //Child wrt to Admin
    @ManyToOne
    @JoinColumn
    private Admin admin;


    // Many to many with user
    @ManyToMany(mappedBy ="serviceProviderList",cascade = CascadeType.ALL)
     private List<User> users;


    // Parent wrt to connection
    @OneToMany(mappedBy ="ServiceProvider",cascade = CascadeType.ALL)
    private List<Connection> connectionList;


    // parent wrt to Country
    @OneToMany(mappedBy ="serviceProvider",cascade = CascadeType.ALL)
    private List<Country> countryList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
}
