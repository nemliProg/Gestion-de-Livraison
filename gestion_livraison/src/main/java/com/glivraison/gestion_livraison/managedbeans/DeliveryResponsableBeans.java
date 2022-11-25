package com.glivraison.gestion_livraison.managedBeans;


import com.glivraison.gestion_livraison.entities.DeliveryResponsible;
import com.glivraison.gestion_livraison.entities.Driver;
import com.glivraison.gestion_livraison.services.AuthService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@RequestScoped
@Named("deliveryResponsableBeans")
public class DeliveryResponsableBeans implements Serializable {
    DeliveryResponsible deliveryResponsible = new DeliveryResponsible();

    public DeliveryResponsible getDeliveryResponsible() {
        return deliveryResponsible;
    }

    public void setDeliveryResponsible(DeliveryResponsible deliveryResponsible) {
        this.deliveryResponsible = deliveryResponsible;
    }

    public String login() throws Exception {
        if (new AuthService().authDeliveryResponsable(this.deliveryResponsible)) {
            // return url success
            System.out.println("dazt");

        } else {
            // return url failed
            System.out.println("madaztsh");
        }

        return "index.xhtml";

    }


}