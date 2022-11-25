package com.glivraison.gestion_livraison.dao;

import com.glivraison.gestion_livraison.entities.DeliveryResponsible;
import com.glivraison.gestion_livraison.util.Hash;
import com.glivraison.gestion_livraison.util.JPA;
import jakarta.persistence.Query;

public class DeliveryResponsibleDao {


    public DeliveryResponsible login(DeliveryResponsible deliveryResponsible) throws Exception {
        DeliveryResponsible deliveryResponsible1 = new DeliveryResponsible();
        try {
            Query query = JPA.entityManager().createQuery("select deliveryResponsible from DeliveryResponsible deliveryResponsible where  deliveryResponsible.email=:email");
            query.setParameter("email", deliveryResponsible.getEmail());
            deliveryResponsible1 = (DeliveryResponsible) query.getSingleResult();
            System.out.println("LOGIN 1");

        } catch (Exception e) {
            return null;
        }

        if (deliveryResponsible1 != null && ( Hash.MD5(deliveryResponsible.getPassword())).equals(deliveryResponsible1.getPassword())) {
            System.out.println("LOGIN 2");
            return deliveryResponsible1;
        }
        return null;
    }
}
