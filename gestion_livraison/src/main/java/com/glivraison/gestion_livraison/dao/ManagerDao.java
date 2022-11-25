package com.glivraison.gestion_livraison.dao;

import com.glivraison.gestion_livraison.entities.Manager;
import com.glivraison.gestion_livraison.util.Hash;
import com.glivraison.gestion_livraison.util.JPA;
import jakarta.persistence.Query;

public class ManagerDao {


    public Manager login(Manager manager) throws Exception {
        Manager manager1 = new Manager();
        try {
            Query query = JPA.entityManager().createQuery("select manager from Manager manager where  manager.email=:email");
            query.setParameter("email", manager.getEmail());
            manager1 = (Manager) query.getSingleResult();
            System.out.println("LOGIN 1");

        } catch (Exception e) {
            return null;
        }

        if (manager1 != null && (Hash.MD5(manager.getPassword())).equals(manager1.getPassword())) {
            System.out.println("LOGIN 2");
            return manager1;
        }
        return null;
    }
}
