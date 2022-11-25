package com.glivraison.gestion_livraison.managedBeans;


import com.glivraison.gestion_livraison.entities.Admin;
import com.glivraison.gestion_livraison.entities.CategorieVehicle;
import com.glivraison.gestion_livraison.services.AuthService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@RequestScoped
@Named("adminBeans")
public class AdminBeans implements Serializable {
    Admin admin = new Admin();

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String login() throws Exception {
        if (new AuthService().authAdmin(this.admin)) {
            System.out.println("dazt");

        } else {
            System.out.println("madaztsh");
        }

        return "index.xhtml";

    }


}