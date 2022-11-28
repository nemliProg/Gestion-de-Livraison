package com.glivraison.gestion_livraison.managedBeans;


import com.glivraison.gestion_livraison.entities.Admin;
import com.glivraison.gestion_livraison.entities.Manager;
import com.glivraison.gestion_livraison.services.AddManagerService;
import com.glivraison.gestion_livraison.services.AuthService;
import com.glivraison.gestion_livraison.services.DeleteManagerService;
import com.glivraison.gestion_livraison.services.ManagerListService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

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

    public List<Manager> managerList() {
        return new ManagerListService().execute();
    }

    public String save() throws Exception {
        System.out.println("save");

        new AddManagerService().execute(this.manager);
        return "/views/admin/dashboard.xhtml?faces-redirect=true";
    }

    public String delete(Long id) throws Exception {
        System.out.println("eeee");
        new DeleteManagerService().execute((long) id);
        return "/views/admin/dashboard.xhtml?faces-redirect=true";
    }

}