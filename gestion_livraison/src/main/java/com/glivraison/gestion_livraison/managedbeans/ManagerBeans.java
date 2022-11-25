package com.glivraison.gestion_livraison.managedBeans;


import com.glivraison.gestion_livraison.entities.Admin;
import com.glivraison.gestion_livraison.entities.Manager;
import com.glivraison.gestion_livraison.services.AuthService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@RequestScoped
@Named("managerBeans")
public class ManagerBeans implements Serializable {
    Manager manager = new Manager();

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String login() throws Exception {
        if (new AuthService().authManager(this.manager)) {
           // return url success
            System.out.println("dazt");

        } else {
            // return url failed
            System.out.println("madaztsh");
        }

        return "index.xhtml";

    }


}