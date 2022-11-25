package com.glivraison.gestion_livraison.managedBeans;


import com.glivraison.gestion_livraison.entities.Driver;
import com.glivraison.gestion_livraison.entities.Manager;
import com.glivraison.gestion_livraison.services.AuthService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@RequestScoped
@Named("driverBeans")
public class DriverBeans implements Serializable {
    Driver driver = new Driver();

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String login() throws Exception {
        if (new AuthService().authDriver(this.driver)) {
            // return url success
            System.out.println("dazt");

        } else {
            // return url failed
            System.out.println("madaztsh");
        }

        return "index.xhtml";

    }


}