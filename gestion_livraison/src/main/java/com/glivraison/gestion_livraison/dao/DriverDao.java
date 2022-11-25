package com.glivraison.gestion_livraison.dao;

import com.glivraison.gestion_livraison.entities.Driver;
import com.glivraison.gestion_livraison.entities.Manager;
import com.glivraison.gestion_livraison.util.Hash;
import com.glivraison.gestion_livraison.util.JPA;
import jakarta.persistence.Query;

public class DriverDao {


    public Driver login(Driver driver) throws Exception {
        Driver driver1 = new Driver();
        try {
            Query query = JPA.entityManager().createQuery("select manager from Driver manager where  manager.email=:email");
            query.setParameter("email", driver.getEmail());
            driver1 = (Driver) query.getSingleResult();
            System.out.println("LOGIN 1");

        } catch (Exception e) {
            return null;
        }

        if (driver1 != null && (Hash.MD5(driver.getPassword())).equals(driver1.getPassword())) {
            System.out.println("LOGIN 2");
            return driver1;
        }
        return null;
    }
}
