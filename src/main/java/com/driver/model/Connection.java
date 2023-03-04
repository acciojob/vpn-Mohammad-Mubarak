package com.driver.model;

import javax.persistence.*;

@Entity
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;



    //Child wrt to User
    @ManyToOne
    @JoinColumn
    private User user;

    public Connection() {
    }

    //CHild wrt to service provider
    @ManyToOne
    @JoinColumn
    private ServiceProvider ServiceProvider;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public com.driver.model.ServiceProvider getServiceProvider() {
        return ServiceProvider;
    }

    public void setServiceProvider(com.driver.model.ServiceProvider serviceProvider) {
        ServiceProvider = serviceProvider;
    }
}
