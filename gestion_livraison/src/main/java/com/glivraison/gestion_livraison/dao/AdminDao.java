package com.glivraison.gestion_livraison.dao;

import com.glivraison.gestion_livraison.entities.Admin;
import com.glivraison.gestion_livraison.util.Hash;
import com.glivraison.gestion_livraison.util.JPA;
import jakarta.persistence.Query;

public class AdminDao {



    public Admin login(Admin admin) throws Exception {
        Admin admin1 = new Admin();
        try {
            Query query = JPA.entityManager().createQuery("select admin from Admin admin where  admin.email=:email");
            query.setParameter("email", admin.getEmail());
            admin1 = (Admin) query.getSingleResult();
            System.out.println("LOGIN 1");

        } catch (Exception e) {
            return null;
        }

        if (admin1 != null && (Hash.MD5(admin.getPassword())).equals(admin1.getPassword())) {
            System.out.println("LOGIN 2");
            return admin1;
        }
        return null;
    }
}
