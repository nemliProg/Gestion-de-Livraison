package com.glivraison.gestion_livraison.managedbeans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;


@RequestScoped
@Named("categoryManagedBean")
public class CategoryManagedBean implements Serializable {
    //attributes
    private String type;

    //constructor
    public CategoryManagedBean() {}

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
